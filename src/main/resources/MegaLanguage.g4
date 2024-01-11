grammar MegaLanguage;

import Arithmetic;

@header {
package language;
}

atom
   : NUMBER
   | VARIABLE {
   	if ( !$commands::variables.contains($VARIABLE.text) ) {
   	    throw new language.UnknownVariableException($VARIABLE.text, $parser);
   	}
   }
   ;

program
    : commands[new java.util.HashSet<>()]
    ;

command[java.util.Set<String> variables]
    : varDeclaration[variables]  # baseCommand
    | print                      # baseCommand
    | condition[variables]       # statement
    | while[variables]           # statement
    ;

commands[java.util.Set<String> variables]
    : LINE_END? command[variables]? (LINE_END command[variables])* LINE_END?
    ;

varDeclaration[java.util.Set<String> variables]
    : VARIABLE EQ expression {$variables.add($VARIABLE.text);} # varEvaluated
    | VARIABLE EQ read[$VARIABLE.text] {$variables.add($VARIABLE.text);}      # varRead
    ;

print
    : 'печать' expression
    ;

read[String name]
    : 'считатьЧисло' # readInt
    ;

condition[java.util.Set<String> variables]
    : 'если' expression commandBlock[variables] (else='иначе' commandBlock[variables])?
    ;

while[java.util.Set<String> variables]
    : 'пока' expression commandBlock[variables]
    ;

commandBlock[java.util.Set<String> variables]
    : LBRACKET commands[$variables] RBRACKET
    ;

COMMENT
    : '#' .*? [\r\n]+ -> skip
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
   : ([\r]+ | SPACE) -> skip
   ;

