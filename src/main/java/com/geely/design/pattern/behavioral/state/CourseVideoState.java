package com.geely.design.pattern.behavioral.state;

/**
 * 描述:
 *
 * @author xvanning
 * @create 2020-06-07 18:27
 */
public abstract class CourseVideoState {
    protected CourseVideoContext courseVideoContext;

    public CourseVideoContext getCourseVideoContext() {
        return courseVideoContext;
    }

    public void setCourseVideoContext(CourseVideoContext courseVideoContext) {
        this.courseVideoContext = courseVideoContext;
    }

    public abstract void play();
    public abstract void speed();
    public abstract void pause();
    public abstract void stop();
}