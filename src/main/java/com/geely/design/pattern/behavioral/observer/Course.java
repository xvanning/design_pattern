package com.geely.design.pattern.behavioral.observer;

import java.util.Observable;

/**
 * 描述:
 *
 * @author xvanning
 * @create 2020-06-06 20:42
 */
public class Course extends Observable {
    private String name;

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void produceQuestion(Course course, Question question){
        System.out.println(question.getUserName() + "已经在" + course.getName() + "上发布了一个问题");
        setChanged();
        notifyObservers(question);
    }
}