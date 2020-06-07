package com.geely.design.pattern.behavioral.visitor;

/**
 * 描述:
 *
 * @author xvanning
 * @create 2020-06-07 13:54
 */
public abstract class Course {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void accept(IVisitor iVisitor);
}