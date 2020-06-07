package com.geely.design.pattern.behavioral.midator;

import java.util.Date;

/**
 * 描述:
 *
 * @author xvanning
 * @create 2020-06-07 13:38
 */
public class StudyGroup {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + "[" + user.getName() + "]" + message);
    }
}