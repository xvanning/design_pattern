package com.geely.design.pattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 描述:
 *
 * @author xvanning
 * @create 2020-06-06 20:44
 */
public class Teacher implements Observer {
    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println(teacherName + "老师的" + course.getName()
                + "课程接收到一个" + question.getUserName()
                + "提交的问答：" + question.getQuestionContent());
    }
}