
grammar Snot;


/* ---------------- Parser Rules ---------------------*/
program : declaration+;

declaration 
	: var_declaration ';'
	| function_declaration 
	| class_declaration;

class_declaration 
	: 'class' ID '{' (var_declaration';')* function_declaration* '}';

var_declaration 
	: MODIFIER? type ID ('[' INT_LITERAL ']')? ('=' expression)?;

type 
	: ID 
	| TYPE_DECLARATION;

value 
	: INT_LITERAL 
	| STRING_LITERAL
	| BOOLEAN_LITERAL
	| FLOAT_LITERAL;

function_declaration 
	: type ID '(' parameter_list? ')' '{' command* '}';

parameter_list 
	: type ID (',' type ID)*;

argument_list
	: argument (',' argument)*;

argument
	: ID | value ;

command 
	: call_procedure ';' 
	| selection 
	| loop 
	| call_method ';'
	| var_declaration ';'
	| attribution ';'
	;

call_method 
	: ID '.' call_procedure;

call_procedure 
	: ID '(' argument_list? ')';

//------------------------------------------------------------------------!!!!!!!!!!!!!
attribution 
	: ID('[' INT_LITERAL ']')? '=' (call_procedure | call_method | expression);

selection 
	: 'if' '(' expression ')' '{' command* '}' ('else' '{' command* '}')?;

//------------------------------------------------------------------------!!!!!!!!!!!!!
expression 
        : '(' expression ')'					# parenExpression
        | 'not' expression					# notExpression
        | '-' expression					# minusExpression
        | expression ('and' | 'or') expression			# andOrOrExpression
        | expression ('>'|'>='|'<'|'<='|'=='|'!=') expression	# compareExpression
        | expression ('*' |'/') expression			# multDivExpression
        | expression ('+'|'-') expression			# addOrSubExpression
        | ID							# idExpression	
        | value							# valueExpression;

loop 
	: 'while' expression '{' command* '}' 
	| 'for' type? ID 'in' ID '{' command* '}';



/* ---------------- Lexer Rules ---------------------*/


TYPE_DECLARATION 
	: 'float' 
	| 'int' 
	| 'byte' 
	| 'string' 
	| 'boolean' 
	| 'void' 
	| 'class';

MODIFIER 
	: 'global' 
	| 'const' 
	| 'static';
	
EQUAL 
	: '==';

NOT_EQUAL : '!=';

LESSER 
	: '<';

GREATER 
	: '>';
	
LESSER_OR_EQUAL 
	: '<=';

GREATER_OR_EQUAL 
	: '>=';

//arithimetic
SUM 
	: '+';

MINUS : '-';

MULTIPLICATION
	: '*';

DIVISION 
	: '/';

             
//Literals     
STRING_LITERAL
    :  '"' ( ~('\\'|'"') )* '"'
    ;

FLOAT_LITERAL : DIGIT+ '.' DIGIT*;

INT_LITERAL : (DIGIT+ | BINARY);

BOOLEAN_LITERAL 
	: (TRUE 
	| FALSE);


TRUE : 'true';

FALSE : 'false';

fragment CLASS : 'class';

NOT : 'not' ;

LOGICAL 
	: 'and' 
	| 'or';

AND : 'and';
OR : 'or';

IF : 'if';
ELSE : 'else';

WHILE : 'while';
FOR : 'for';
IN : 'in';

ID
	: LETTER (LETTER|'0'..'9')*
	;

ATTRIBUTION_SIGN : '=';

OPEN_CURLY : '{';
CLOSE_CURLY : '}';

OPEN_PARENTHESIS : '(';
CLOSE_PARENTHESIS : ')';

OPEN_SQUARE_BRACKET : '[';
CLOSE_SQUARE_BRACKET : ']';

COMMA : ',';

SEMICOLON : ';';

DOT: '.';

fragment
LETTER
	:	'$'
	|	'A'..'Z'
	|	'a'..'z'
	|	'_'
	;

fragment 
DIGIT 
	: ('0'..'9')+;

fragment 
BINARY 
	: ('b' '0'..'1')+;

WS : [ \t\r\n]+ -> skip ;

COMMENT
    :   '/*' .*? '*/' -> skip
    ;



