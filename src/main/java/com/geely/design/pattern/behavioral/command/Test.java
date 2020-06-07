package com.geely.design.pattern.behavioral.command;

/**
 * 描述:
 *
 * @author xvanning
 * @create 2020-06-07 13:09
 */
public class Test {
    public static void main(String[] args) {
        CourseVideo courseVideo = new CourseVideo("设计模式");
        OpenCourseVideo openCourseVideo = new OpenCourseVideo(courseVideo);
        CloseCourseVideo closeCourseVideo = new CloseCourseVideo(courseVideo);

        Staff staff = new Staff();
        staff.addCommand(openCourseVideo);
        staff.addCommand(closeCourseVideo);

        staff.executeCommands();
    }
}