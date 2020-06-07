package com.geely.design.pattern.behavioral.command;

/**
 * 描述:
 *
 * @author xvanning
 * @create 2020-06-07 11:39
 */
public class CourseVideo {
    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println(this.name + "视频开放");
    }

    public void close() {
        System.out.println(this.name + "视频关闭");
    }
}