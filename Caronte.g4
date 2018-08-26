grammar Caronte;

	inicio: (bloco)+;

	bloco: 	comandoexpressao |
		'struct' Nome '{' ( tipovar Nome | 'array' tipovar Nome ('[' Inteiro ']')+ ) ( ',' ( tipovar Nome | 'array' tipovar Nome ('[' Inteiro ']')+ ) )* '}' ';' |
		nomedafuncao corpodafuncao | 
		'define' Nome valores;

	trecho: (comando)+ (ultimocomando)? |
		(comando)* ultimocomando;
	
	comando: comandobloco | comandounico ';';

	comandobloco: 'do' trecho 'end' |
		      'while' exp 'do' trecho 'end' | 
		      'repeat' trecho 'until' exp ';' | 
		      'if' exp 'then' trecho ('elseif' exp 'then' trecho)* ('else' trecho)? 'end' |
		      'for' ((tipovar | 'auto') Nome '=' exp)? ':' (exp)? ':' (comandounico)? 'do' trecho 'end' | 
		      'for'  listadenomes 'in' listaexp 'do' trecho 'end' |  'goto' Nome ';' | Nome ':' comando;
	
	comandoexpressao:   var listaatri exp | 
			    'array' tipovar var ( '[' Inteiro ']' )+ ('=' exp)? |
			    tipovar var ('=' exp)? |
			    'auto' var '=' exp;
	
	comandounico: comandoexpressao | listaexp;

	ultimocomando: 'return' (listaexp)? ';' | 'break' ';';
	
	listaatri: ',' var listaatri exp ',' | '=';

	Inteiro: ('-')?[0-9]+;

	nomedafuncao: ('inline')? tiporet Nome;

	tipovar: 'boolean' | 'int' | 'double' | 'float' | 'string' | Nome;
	
	tiporet: tipovar | 'void';

	listavar: var (',' var)*;

	var:  Nome ('.' Nome)* ('[' Inteiro ']' ('.' Nome)* )*;

	listadenomes: Nome (',' Nome)*;

	listaexp: (exp ',')* exp;

	exp:    valores | expprefixo | '{' (listaexp)? '}' |
		exp opbin exp | opunaria exp | '(' exp ')';

	valores: 'null' | 'false' | 'true' | Decimal | String | Inteiro;

	Decimal: ('-')? [0-9]+ '.' [0-9]+;

	String: '"' (~('"' | '\\' | '\r' | '\n') | '\\' ('"' | '\\'))* '"';

	Nome: [a-zA-Z_][a-zA-Z_0-9]*;

	expprefixo: var | chamadadefuncao;

	chamadadefuncao:  Nome '(' (listaexp)? ')';

	corpodafuncao: '(' (listapar)? ')' ':' trecho 'end';

	listapar: (tipovar Nome ',')* tipovar Nome;

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
