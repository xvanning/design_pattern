package com.geely.design.pattern.behavioral.responsibilitychain;

/**
 * 描述:
 *
 * @author xvanning
 * @create 2020-06-05 12:06
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course();
        course.setName("责任链模式");
        course.setArticle("手记");
        course.setVideo("视频");
        course.setPrice("121");

        Handler articleHandler = new ArticleHandler();
        Handler videoHandler = new VideoHandler();
        Handler priceHandler = new PriceHandler();


        //注意这边的环状要求
        articleHandler.setNextHandler(videoHandler);
        videoHandler.setNextHandler(priceHandler);
        articleHandler.handle(course);
    }
}