package com.geely.design.pattern.behavioral.memento;

/**
 * 描述:
 *
 * @author xvanning
 * @create 2020-06-06 21:34
 */
public class Test {
    public static void main(String[] args) {
        ArticleMementoManager articleMementoManager = new ArticleMementoManager();
        Article articleA = new Article("标题aaa", "内容aaa", "照片aaa");

        ArticleMemento articleMemento = articleA.saveToMemento();
        articleMementoManager.putMemento(articleMemento);
        System.out.println("标题：" + articleA.getTitle() + "内容：" + articleA.getContent() + "照片：" + articleA.getImags());
        System.out.println("完整手记信息：" + articleA);

        System.out.println("-----修改手记开始-----");
        articleA.setTitle("标题www");
        articleA.setContent("内容www");
        articleA.setImags("照片www");
        System.out.println("-----修改手记结束-----");
        System.out.println("完整手记信息：" + articleA);

        System.out.println("-----开始回退-----");
        ArticleMemento memento = articleMementoManager.getMemento();
        articleA.undoFromMemento(memento);
        System.out.println("完整手记信息：" + articleA);

    }

}