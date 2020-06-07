package com.geely.design.pattern.behavioral.visitor;

/**
 * 描述:
 *
 * @author xvanning
 * @create 2020-06-07 13:54
 */
public class CodingCourse extends Course{
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void accept(IVisitor iVisitor) {
        iVisitor.visit(this);
    }
}