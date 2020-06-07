package com.geely.design.pattern.behavioral.command;

/**
 * 描述:
 *
 * @author xvanning
 * @create 2020-06-07 11:41
 */
public class CloseCourseVideo implements Command{
    private CourseVideo courseVideo;

    public CloseCourseVideo(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void excute() {
        courseVideo.close();
    }
}