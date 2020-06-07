package com.geely.design.pattern.behavioral.observer;

/**
 * 描述:
 *
 * @author xvanning
 * @create 2020-06-06 20:43
 */
public class Question {
    private String userName;
    private String questionContent;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }
}