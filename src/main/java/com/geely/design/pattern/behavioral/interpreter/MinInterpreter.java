package com.geely.design.pattern.behavioral.interpreter;

/**
 * 描述:
 *
 * @author xvanning
 * @create 2020-06-06 20:01
 */
public class MinInterpreter implements Interpreter{

    private Interpreter firstExpression, secondExpression;

    public MinInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpret() {
        return firstExpression.interpret() - secondExpression.interpret();
    }

    @Override
    public String toString() {
        return "-";
    }
}