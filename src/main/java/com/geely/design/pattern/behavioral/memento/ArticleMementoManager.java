package com.geely.design.pattern.behavioral.memento;

import java.util.Stack;

/**
 * 描述:
 *
 * @author xvanning
 * @create 2020-06-06 21:34
 */
public class ArticleMementoManager {
    private final Stack<ArticleMemento> stack = new Stack<ArticleMemento>();

    public ArticleMemento getMemento() {
        return stack.pop();
    }

    public void putMemento(ArticleMemento articleMemento){
        stack.push(articleMemento);
    }
}