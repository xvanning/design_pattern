package com.geely.design.pattern.behavioral.strategy;

/**
 * 描述:
 *
 * @author xvanning
 * @create 2020-06-06 19:13
 */
public class EmptyPromotionStrategy implements PromotionStrategy{

    @Override
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}