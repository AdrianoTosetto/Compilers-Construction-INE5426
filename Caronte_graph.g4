

	Inicio::= (Bloco)+

	Bloco ::= Trecho | Nomedafuncao Corpodafuncao | 'define' Nome Valores

	Trecho ::= (Comando)+ (Ultimocomando)? |
			(Comando)* Ultimocomando

	Comando ::=  (listavar '=')? listaexp ';' | 
		 Tipo_Var var ('=' exp)? ';' |
		 'auto' var '=' exp ';' |
		 chamadadefuncao ';' | 
		 'do' trecho 'end' | 
		 'while' exp 'do' trecho 'end' | 
		 'repeat' trecho 'until' exp ';' | 
		 'if' exp 'then' trecho ('elseif' exp 'then' trecho)* ('else' trecho)? 'end' | 
		 'for' '(' ((Tipo_Var | 'auto') Nome '=' exp)? ';' (exp)? ';' (exp)? ')' 'do' trecho 'end' | 
		 'for' '(' listadenomes 'in' listaexp ')' 'do' trecho 'end'

	Ultimocomando ::= 'return' (Listaexp)? ';' | 'break' ';'

	Nomedafuncao ::= ('inline')? Tipo_Ret Nome

	Tipo_Var ::= 'boolean' | 'int' | 'double' | 'float' | 'string'

	Tipo_Ret ::= Tipo_Var | 'void'

	Listavar ::= var (',' var)*

	Var ::=  Nome

	Listadenomes ::= Nome (',' Nome)*

	Listaexp ::= (Exp ',')* Exp

	Exp ::=  Valores | '...' | Expprefixo |
			 Exp Opbin Exp | Opunaria Exp | '(' Exp ')'

	Valores ::= 'null' | 'false' | 'true' | Numero | String

	Numero ::= [0-9]+(','[0-9]+)?

	String ::= '"' [^"]* '"' | "'" [^']* "'"

	Nome ::= [a-zA-Z_][a-zA-Z_0-9]*

	Expprefixo ::= var | chamadadefuncao

	Chamadadefuncao ::=  Nome '(' (Listaexp)? ')'

	Corpodafuncao ::= '(' (Listapar)? ')' ':' Trecho 'end'

	Listapar ::= (Tipo_Var Nome ',')* Tipo_Var Nome

	Opbin ::= '+' | '-' | '*' | '/' | '^' | '%' | '..' | 
		 '<' | '<=' | '>' | '>=' | '==' | '!=' | 
		 'and' | 'or' | '+=' | '-=' | '*=' | '/=' | '^=' | '%='

	Opunaria ::= '-' | 'not' | '#' | '++' | '--'