package com.geely.design.pattern.behavioral.responsibilitychain;

/**
 * 描述:
 *
 * @author xvanning
 * @create 2020-06-05 11:59
 */
public abstract class Handler {
    protected Handler handler;
    public void setNextHandler(Handler handler) {
        this.handler = handler;
    }

    public abstract void handle(Course course);
}