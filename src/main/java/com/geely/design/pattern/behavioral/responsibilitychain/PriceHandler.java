package com.geely.design.pattern.behavioral.responsibilitychain;

import org.apache.commons.lang.StringUtils;

/**
 * 描述:
 *
 * @author xvanning
 * @create 2020-06-05 12:11
 */
public class PriceHandler extends Handler {
    @Override
    public void handle(Course course) {
        if (StringUtils.isNotEmpty(course.getPrice())) {
            System.out.println(course.getName() + "含有价格，批准");
            if (handler != null) {
                handler.handle(course);
            }
        } else {
            System.out.println(course.getName() + "不含有价格，不批准");
        }

    }
}