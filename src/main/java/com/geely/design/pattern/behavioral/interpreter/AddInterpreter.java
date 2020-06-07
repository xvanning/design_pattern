package com.geely.design.pattern.behavioral.interpreter;

/**
 * 描述:
 *
 * @author xvanning
 * @create 2020-06-06 20:01
 */
public class AddInterpreter implements Interpreter{

    private Interpreter firstExpression, secondExpression;

    public AddInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpret() {
        return firstExpression.interpret() + secondExpression.interpret();
    }

    @Override
    public String toString() {
        return "+";
    }
}