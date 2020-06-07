package com.geely.design.pattern.behavioral.memento;

/**
 * 描述:
 *
 * @author xvanning
 * @create 2020-06-06 21:34
 */
public class Article {
    private String title;
    private String content;
    private String imags;

    public Article(String title, String content, String imags) {
        this.title = title;
        this.content = content;
        this.imags = imags;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImags() {
        return imags;
    }

    public void setImags(String imags) {
        this.imags = imags;
    }

    public ArticleMemento saveToMemento() {
        ArticleMemento articleMemento = new ArticleMemento(this.title,this.content,this.imags);
        return articleMemento;
    }

    public void undoFromMemento(ArticleMemento articleMemento) {
        this.title = articleMemento.getTitle();
        this.content = articleMemento.getContent();
        this.imags = articleMemento.getImags();
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", imags='" + imags + '\'' +
                '}';
    }
}