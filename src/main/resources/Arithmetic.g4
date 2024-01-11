grammar Arithmetic;

expression
    : expression (TIMES | DIV) expression
    | expression (PLUS | MINUS) expression
    | LPAREN expression RPAREN
    | (PLUS | MINUS)* atom
    ;

atom
   : NUMBER | VARIABLE
   ;

LPAREN
    : '('
    ;

RPAREN
    : ')'
    ;

PLUS
   : '+'
   ;


MINUS
   : '-'
   ;


TIMES
   : '*'
   ;


DIV
   : '/'
   ;


NUMBER
   : MINUS?DIGIT+
   ;

VARIABLE
   : LETTER+
   ;

DIGIT
   : ('0' .. '9')
   ;

LETTER
   : ('a' .. 'z')
   ;


WS
   : (LINE_END | SPACE) -> skip
   ;

LINE_END
    : [\r\n]+
    ;

SPACE
    : [ \t]+
    ;