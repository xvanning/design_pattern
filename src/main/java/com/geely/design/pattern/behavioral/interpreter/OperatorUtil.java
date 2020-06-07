package com.geely.design.pattern.behavioral.interpreter;

/**
 * 描述:
 *
 * @author xvanning
 * @create 2020-06-06 20:11
 */
public class OperatorUtil {
    public static boolean isOperator(String symbol) {
        return (symbol.equals("+") || (symbol.equals("*")));
    }

    public static Interpreter getExpressionObject(Interpreter firstInterpreter,Interpreter secondInterpreter,String symbol) {
        if(symbol.equals("+")) {
            return new AddInterpreter(firstInterpreter,secondInterpreter);
        } else if (symbol.equals("*")){
            return new MultiInterpreter(firstInterpreter,secondInterpreter);
        }
        return null;
    }
}