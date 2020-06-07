package com.geely.design.pattern.behavioral.memento;

/**
 * 描述:
 *
 * @author xvanning
 * @create 2020-06-06 21:34
 */
public class ArticleMemento {
    private String title;
    private String content;
    private String imags;

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getImags() {
        return imags;
    }

    public ArticleMemento(String title, String content, String imags) {
        this.title = title;
        this.content = content;
        this.imags = imags;
    }
}