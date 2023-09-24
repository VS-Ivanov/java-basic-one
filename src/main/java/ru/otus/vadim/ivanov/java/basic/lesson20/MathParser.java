package ru.otus.vadim.ivanov.java.basic.lesson20;

import java.util.regex.*;
public class MathParser {

    private static final String expressionPattern = "^([0-9]{1,9})\\W{0,1}([-+*\\/])\\W{0,1}([0-9]{1,9})$";
    public static MathParserResult parse(String expression) throws MathParserException {
        // парсим математическое выражение из строки
        try {
          //разбираем только выражения с двумя операндами и одной операцией
          if(!expression.matches(expressionPattern)) {
              throw new MathParserException("Error parsing expression: " + expression);
          }

          Pattern exprPattern = Pattern.compile(expressionPattern);

          Matcher exprMatcher = exprPattern.matcher(expression);
          exprMatcher.find();

          return new MathParserResult(Integer.valueOf(exprMatcher.group(1)),Integer.valueOf(exprMatcher.group(3)),exprMatcher.group(2));

        } catch (Exception e) {
            throw new MathParserException("Error parsing expression: " + expression);
        }

    }

}
