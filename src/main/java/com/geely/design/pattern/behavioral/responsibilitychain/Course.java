package com.geely.design.pattern.behavioral.responsibilitychain;

/**
 * 描述:
 *
 * @author xvanning
 * @create 2020-06-05 11:56
 */
public class Course {
    private String name;
    private String article;
    private String video;
    private String price;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
}