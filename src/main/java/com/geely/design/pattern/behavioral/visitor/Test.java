package com.geely.design.pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 *
 * @author xvanning
 * @create 2020-06-07 13:54
 */
public class Test {
    public static void main(String[] args) {
        List<Course> list = new ArrayList<Course>();
        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("SpringMVC");
        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setName("Java设计模式");
        codingCourse.setPrice(100);

        list.add(freeCourse);
        list.add(codingCourse);

        for (Course course: list) {
            course.accept(new Visitor());
        }
    }
}