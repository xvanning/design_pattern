package com.geely.design.pattern.behavioral.observer;

/**
 * 描述:
 *
 * @author xvanning
 * @create 2020-06-06 21:13
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course("Java设计模式精讲");
        Teacher teacher = new Teacher("anning");

        course.addObserver(teacher);

        Question question = new Question();
        question.setUserName("xiaomai");
        question.setQuestionContent("观察者模式怎么学习");
        course.produceQuestion(course,question);
    }
}