package com.geely.design.pattern.behavioral.midator;

/**
 * 描述:
 *
 * @author xvanning
 * @create 2020-06-07 13:39
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        StudyGroup.showMessage(this, message);
    }
}