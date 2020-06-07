package com.geely.design.pattern.behavioral.visitor;

/**
 * 描述:
 *
 * @author xvanning
 * @create 2020-06-07 13:54
 */
public class FreeCourse extends Course{

    @Override
    public void accept(IVisitor iVisitor) {
        iVisitor.visit(this);
    }
}