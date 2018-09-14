grammar Caronte;

	inicio: (bloco)+;

	bloco: 	comandoexpressao |
		'struct' Nome '{' ( tipovar Nome | 'array' tipovar Nome ('[' Inteiro ']')+ ) ( ',' ( tipovar Nome | 'array' tipovar Nome ('[' Inteiro ']')+ ) )* '}' ';' |
		nomedafuncao corpodafuncao | 
		'define' Nome valores;

	trecho: (comando)+ (ultimocomando)? |
		(comando)* ultimocomando;
	
	comando: comandobloco | comandounico ';' |
		comandounico
			{notifyErrorListeners("';' é necessário");}
		;

	comandobloco: 'do' trecho 'end' |
		      'while' exp 'do' trecho 'end' | 
		      'repeat' trecho 'until' exp ';' | 
		      'if' exp 'then' trecho ('elseif' exp 'then' trecho)* ('else' trecho)? 'end' |
		      'for' ((tipovar | 'auto') Nome '=' exp)? ':' (exp)? ':' (comandounico)? 'do' trecho 'end' | 
		      'for'  listadenomes 'in' listaexp 'do' trecho 'end' |  'goto' Nome ';' | Nome ':' comando;
	
	comandoexpressao:   var listaatri exp | 
			    'array' tipovar var ( '[' Inteiro ']' )+ ('=' exp)? |
			    tipovar var ('=' exp)? |
			    'auto' var '=' exp | erro_var_declaracao;

	erro_var_declaracao: 'auto' var 
	{notifyErrorListeners(" variável  "+ $var.text + " é do tipo auto e precisa ser declarada com algum valor!");}

	;
	
	comandounico: comandoexpressao | listaexp;

	ultimocomando: 'return' (listaexp)? ';' | 'break' ';';
	
	listaatri: ',' var listaatri exp ',' | '=';

	Inteiro: ('-')?[0-9]+;

	nomedafuncao: ('inline' | 'fastcall')? tiporet Nome |
		'inline' 'fastcall' tiporet Nome 
		{notifyErrorListeners("fastcall e inline não podem ser usados para uma mesma função");}
		;

	tipovar: 'boolean' | 'int' | 'double' | 'float' | 'string' | Nome;
	
	tiporet: tipovar | 'void';

	listavar: var (',' var)*;

	var:  Nome ('.' Nome)* ('[' Inteiro ']' ('.' Nome)* )*;

	listadenomes: Nome (',' Nome)*;

	listaexp: (exp ',')* exp;

	exp:    valores | expprefixo | '{' (listaexp)? '}' |
		exp opbin exp | opunaria exp | '(' exp ')' |
		'(' exp {notifyErrorListeners(" existem parênteses não fechados! ");} |
		exp ')' {notifyErrorListeners(" existem parênteses fechados a mais! ");} |
		exp opbin {notifyErrorListeners("um operando era esperado no lado direito de " + $opbin.text);} |
		opbin exp {notifyErrorListeners("um operando era esperado no lado esquerdo de " + $opbin.text);} |
		opunaria {notifyErrorListeners("Era esperado um operando para " + $opunaria.text);}
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
