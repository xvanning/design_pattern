package com.geely.design.pattern.behavioral.interpreter;

import java.util.Stack;

/**
 * 描述:
 *
 * @author xvanning
 * @create 2020-06-06 20:09
 */
public class AnningExpressionParser {
    private Stack<Interpreter> stack = new Stack<Interpreter>();

    public int parse(String str) {
        String[] strItemArray = str.split(" ");
        for (String symbol : strItemArray) {
            if (!OperatorUtil.isOperator(symbol)) {
                Interpreter numExpression = new NumInterpreter(symbol);
                stack.push(numExpression);
                System.out.println(String.format("入栈：%d", numExpression.interpret()));
            } else {
                Interpreter firstExpression = stack.pop();
                Interpreter secondExpression = stack.pop();
                System.out.println(String.format("出栈：%d 和 %d", firstExpression.interpret(), secondExpression.interpret()));
                Interpreter opertor = OperatorUtil.getExpressionObject(firstExpression, secondExpression, symbol);
                System.out.println(String.format("应用运算符: %s", opertor));
                int result = opertor.interpret();
                NumInterpreter resInterpreter = new NumInterpreter(result);
                stack.push(resInterpreter);
                System.out.println(String.format("阶段结果入栈：%d", resInterpreter.interpret()));
            }
        }
        int res = stack.pop().interpret();
        return res;
    }
}