grammar MegaLanguage;

import Arithmetic;

@header {
package language;
}

typeExpression returns [ExpressionType type]
    : typeExpression comp_op typeExpression {$type = ExpressionType.BOOLEAN;}
    | expression {$type = ExpressionType.INT;}
    ;

atom
   : NUMBER
   | VARIABLE {
   	if ( !$commands::variables.containsKey($VARIABLE.text) ) {
   	    throw new language.UnknownVariableException($VARIABLE.text, $parser);
   	}
   }
   ;

program
    : commands[new java.util.HashMap<>()]
    ;

command[java.util.Map<String, ExpressionType> variables]
    : varDeclaration[variables]  # baseCommand
    | print                      # baseCommand
    | condition[variables]       # statement
    | while[variables]           # statement
    ;

commands[java.util.Map<String, ExpressionType> variables]
    : LINE_END? command[variables]? (LINE_END command[variables])* LINE_END?
    ;

varDeclaration[java.util.Map<String, ExpressionType> variables]
    locals [ExpressionType type]
    : VARIABLE EQ typeExpression {
        $type = $typeExpression.type;
        $variables.put($VARIABLE.text, $type);
    } # varEvaluated
    | VARIABLE EQ read[$VARIABLE.text] {
        $type = $read.type;
        $variables.put($VARIABLE.text, $type);
    } # varRead
    ;

print
    : 'печать' typeExpression
    ;

read[String name] returns [ExpressionType type]
    : 'считатьЧисло' {$type = ExpressionType.INT;}     # readInt
    | 'считатьЛогич' {$type = ExpressionType.BOOLEAN;} # readBoolean
    ;

condition[java.util.Map<String, ExpressionType> variables]
    : 'если' typeExpression commandBlock[variables] (else='иначе' commandBlock[variables])? {
        List<String> ambiguousVariables = $ctx.commandBlock().stream()
            .map(v -> v.innerVariables)

            .map(java.util.Map::entrySet)
            .flatMap(java.util.Collection::stream)
            .collect(java.util.stream.Collectors.groupingBy(
                   java.util.Map.Entry::getKey,
                   java.util.stream.Collectors.mapping(
                           java.util.Map.Entry::getValue,
                           java.util.stream.Collectors.toSet()
                   )
            )).entrySet().stream().filter(v -> v.getValue().size() > 1)
            .map(java.util.Map.Entry::getKey)
            .toList();
        if (!ambiguousVariables.isEmpty()) {
            throw new AmbiguousVariableException(ambiguousVariables, $parser);
        }
    }
    ;

while[java.util.Map<String, ExpressionType> variables]
    : 'пока' typeExpression commandBlock[variables]
    ;

commandBlock[java.util.Map<String, ExpressionType> variables] returns [java.util.Map<String, ExpressionType> innerVariables]
    @init {
        $innerVariables = new java.util.HashMap<String, ExpressionType>();
    }
    : LBRACKET commands[$innerVariables] RBRACKET {
        $variables.putAll($innerVariables);
    }
    ;

comp_op
    : '<'
    | '>'
    | '=='
    | '>='
    | '<='
    | '!='
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

