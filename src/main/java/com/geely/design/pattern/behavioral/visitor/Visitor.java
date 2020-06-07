package com.geely.design.pattern.behavioral.visitor;

/**
 * 描述:
 *
 * @author xvanning
 * @create 2020-06-07 13:54
 */
public class Visitor implements IVisitor {

    @Override
    public void visit(FreeCourse freeCourse) {
        System.out.println("免费课程：" + freeCourse.getName());
    }

    @Override
    public void visit(CodingCourse codingCourse) {
        System.out.println("实战课程：" + codingCourse.getName() + " 价格是：" + codingCourse.getPrice());
    }
}