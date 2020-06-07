package com.geely.design.pattern.behavioral.state;

/**
 * 描述:
 *
 * @author xvanning
 * @create 2020-06-07 18:45
 */
public class Test {
    public static void main(String[] args) {
        CourseVideoContext context = new CourseVideoContext();
        context.setCourseVideoState(new PlayState());
        System.out.println("当前状态：" + context.getCourseVideoState().getClass().getSimpleName());

        context.pause();
        System.out.println("当前状态：" + context.getCourseVideoState().getClass().getSimpleName());
        context.speed();
        System.out.println("当前状态：" + context.getCourseVideoState().getClass().getSimpleName());
        context.stop();
        System.out.println("当前状态：" + context.getCourseVideoState().getClass().getSimpleName());
        context.speed();
    }
}