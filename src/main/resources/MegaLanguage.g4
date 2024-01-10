grammar MegaLanguage;

import Arithmetic;

@header {
package language;
}

program
    : commands
    ;

command
    : varDeclaration  # baseCommand
    | print           # baseCommand
    | condition       # statement
    | while           # statement
    ;

commands
    : LINE_END? command? (LINE_END command)* LINE_END?
    ;

varDeclaration
    : VARIABLE EQ expression # varEvaluated
    | VARIABLE EQ read[$VARIABLE.text]       # varRead
    ;

print
    : 'печать' expression
    ;

read[String name]
    : 'считатьЧисло' # readInt
    ;

condition
    : 'если' expression commandBlock elseCondition?
    ;

elseCondition
    : 'иначе' commandBlock
    ;

while
    : 'пока' expression commandBlock
    ;

commandBlock
    : LBRACKET commands RBRACKET
    ;

COMMENT
    : '#' ~[\n]* -> channel (HIDDEN)
    ;

LBRACKET
    : '{'
    ;

RBRACKET
    : '}'
    ;

EQ
    : '='
    ;

WS
   : ([\r]+ | SPACE) -> channel (HIDDEN)
   ;

