grammar Caronte;

	inicio: (bloco)+;

	bloco: trecho | nomedafuncao corpodafuncao | 'define' Nome valores;

	trecho: (comando)+ (ultimocomando)? |
			(comando)* ultimocomando;

	comando:  (listavar '=')? listaexp ';' | 
		'array' tipovar var ( '[' Inteiro ']' )* ('=' exp)? ';' |
		 tipovar var ('=' exp)? ';' |
		 'auto' var '=' exp ';' |
		 chamadadefuncao ';' | 
		 'do' trecho 'end' | 
		 'while' exp 'do' trecho 'end' | 
		 'repeat' trecho 'until' exp ';' | 
		 'if' exp 'then' trecho ('elseif' exp 'then' trecho)* ('else' trecho)? 'end' | 
		 'for' ((tipovar | 'auto') Nome '=' exp)? ';' (exp)? ';' (exp)? 'do' trecho 'end' | 
		 'for'  listadenomes 'in' listaexp 'do' trecho 'end' |  'goto' Nome ';' | Nome ':' comando;

	ultimocomando: 'return' (listaexp)? ';' | 'break' ';';

	Inteiro: [0-9]+;

	nomedafuncao: ('inline')? tiporet Nome;

	tipovar: 'boolean' | 'int' | 'double' | 'float' | 'string' | Nome;
	
	tiporet: tipovar | 'void';

	listavar: var (',' var)*;

	var:  Nome ('.' Nome)* ('[' Inteiro ']' ('.' Nome)* )* | '{' listavar '}';

	listadenomes: Nome (',' Nome)*;

	listaexp: (exp ',')* exp;

	exp:  valores | expprefixo |
			 exp opbin exp | opunaria exp | '(' exp ')';

	valores: 'null' | 'false' | 'true' | Numero | String;

	Numero: [0-9]+('.'[0-9]+)?;

	Inteiro: [0-9]+;

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
