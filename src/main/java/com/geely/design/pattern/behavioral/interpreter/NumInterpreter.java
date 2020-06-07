package com.geely.design.pattern.behavioral.interpreter;

/**
 * 描述:
 *
 * @author xvanning
 * @create 2020-06-06 20:07
 */
public class NumInterpreter implements Interpreter {

    private int num;

    public NumInterpreter(int num) {
        this.num = num;
    }

    public NumInterpreter(String num) {
        this.num = Integer.valueOf(num);
    }

    @Override
    public int interpret() {
        return this.num;
    }

}