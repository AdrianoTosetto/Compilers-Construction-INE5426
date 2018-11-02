grammar Caronte;

	inicio: (bloco)+;

	bloco: 	comandoexpressao #a |
		'struct' Nome '{' ( tipovar Nome | 'array' tipovar Nome ('[' Inteiro ']')+ ) ( ',' ( tipovar Nome | 'array' tipovar Nome ('[' Inteiro ']')+ ) )* '}' ';'
		#structOrArrayDeclaration |
		nomedafuncao corpodafuncao #functionDeclaration | 
		'define' Nome valores #defineDeclaration;

	trecho: (comando)+ (ultimocomando)? |
		(comando)* ultimocomando;
	
	comando: comandobloco | comandounico ';' | erro_ponto_virgula ;

	erro_ponto_virgula: comandounico {notifyErrorListeners("';' é necessário");};

	comandobloco: 'do' trecho 'end' #do |
		      'while' exp 'do' trecho 'end' #while | 
		      'repeat' trecho 'until' exp ';' #repeat | 
		      'if' exp 'then' trecho ('elseif' exp 'then' trecho)* ('else' trecho)? 'end' #if |
		      'for' ((tipovar | 'auto') Nome '=' exp)? ':' (exp)? ':' (comandounico)? 'do' trecho 'end' #for | 
		      'for'  listadenomes 'in' listaexp 'do' trecho 'end' #forInutil | 
		      'goto' Nome ';' #goto | Nome ':' comando #label;
	
	comandoexpressao:   var listaatri exp #atrib | 
			    'array' tipovar var ( '[' Inteiro ']' )+ ('=' exp)? #arrayDeclaration |
			    tipovar var ('=' exp)? #typedDeclaration |
			    'auto' var '=' exp #autoDeclaration | 
			    erro_var_declaracao #errorDeclaration;

	erro_var_declaracao: 'auto' var 
	{notifyErrorListeners(" variável  "+ $var.text + " é do tipo auto e precisa ser declarada com algum valor!");}

	;
	
	comandounico: comandoexpressao | listaexp;

	ultimocomando: 'return' (listaexp)? ';' | 'break' ';';
	
	listaatri: ',' var listaatri exp ',' | '=';

	Inteiro: ('-')?[0-9]+;

	nomedafuncao: ('inline' | 'fastcall')? tiporet Nome |
		erro_inline_fastcall;

	erro_inline_fastcall: 'inline' 'fastcall' tiporet Nome 
		{notifyErrorListeners("fastcall e inline não podem ser usados para uma mesma função");};

	tipovar: 'boolean' | 'int' | 'double' | 'float' | 'string' | Nome;
	
	tiporet: tipovar | 'void';

	listavar: var (',' var)*;

	var:  Nome ('.' Nome)* ('[' Inteiro ']' ('.' Nome)* )*;

	listadenomes: Nome (',' Nome)*;

	listaexp: (exp ',')* exp;

	exp: valores #expValues
		 | expprefixo #expPrefix 
		 | '{' (listaexp)? '}' #expListExp
		 | exp opbin exp #binExp
		 | opunaria exp #unariaExp
		 | '(' exp ')' #paraExp
	;

	valores: 'null' | 'false' | 'true' | Decimal | String | Inteiro;

	Decimal: ('-')? [0-9]+ '.' [0-9]+;

	String: '"' (~('"' | '\\' | '\r' | '\n') | '\\' ('"' | '\\'))* '"';

	Nome: [a-zA-Z_][a-zA-Z_0-9]*;

	expprefixo: var | chamadadefuncao;

	chamadadefuncao:  Nome '(' (listaexp)? ')' ;

	corpodafuncao: '(' (listapar)? ')' ':' trecho 'end';

	listapar: ((tipovar Nome | 'array' tipovar Nome ('[' Inteiro ']')+) ',')* (tipovar Nome | 'array' tipovar Nome ('[' Inteiro ']')+);

	opbin: '+' | '-' | '*' | '/' | '^' | '%' | '..' | 
		 '<' | '<=' | '>' | '>=' | '==' | '!=' | 
		 'and' | 'or' | '+=' | '-=' | '*=' | '/=' | '^=' | '%=';

	opunaria: '-' | 'not' | '#' | '++' | '--';

	WS : [ \t\r\n]+ -> skip ;

	COMMENT
	    : '/*' .*? '*/' -> skip
	;

	LINE_COMMENT
	    : '//' ~[\r\n]* -> skip
	;
