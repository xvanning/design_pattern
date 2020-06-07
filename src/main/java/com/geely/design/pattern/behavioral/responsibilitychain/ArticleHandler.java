package com.geely.design.pattern.behavioral.responsibilitychain;

import org.apache.commons.lang.StringUtils;

/**
 * 描述:
 *
 * @author xvanning
 * @create 2020-06-05 12:02
 */
public class ArticleHandler extends Handler{

    @Override
    public void handle(Course course) {
        if (StringUtils.isNotEmpty(course.getArticle())) {
            System.out.println(course.getName() + "含有手记，批准");
            if(handler != null) {
                handler.handle(course);
            }
        }else{
            System.out.println(course.getName() + "不含有手记，不批准");
        }

    }
}