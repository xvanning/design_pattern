package com.geely.design.pattern.behavioral.interpreter;

/**
 * 描述:
 *
 * @author xvanning
 * @create 2020-06-06 19:59
 */
public class Test {
    public static void main(String[] args) {
        String expression = "6 100 11 + *";
        AnningExpressionParser anningExpressionParser = new AnningExpressionParser();
        anningExpressionParser.parse(expression);
    }
}