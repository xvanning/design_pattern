package com.geely.design.pattern.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述:
 *
 * @author xvanning
 * @create 2020-06-06 19:05
 */
public class PromotionStrategyFactory {
    private static Map<String, PromotionStrategy> promotionStrategyMap = new HashMap<String, PromotionStrategy>();

    static {
        promotionStrategyMap.put("lijian", new LiJianPromotionStrategy());
        promotionStrategyMap.put("fanxian", new FanXianPromotionStrategy());
        promotionStrategyMap.put("manjian", new ManJianPromotionStrategy());
    }

    static PromotionStrategy NON_PROMOTION = new EmptyPromotionStrategy();

    private PromotionStrategyFactory() {
    }

    public static PromotionStrategy getPromotionStrategy(String promotionKey) {
        PromotionStrategy promotionStrategy = promotionStrategyMap.get(promotionKey);
        return promotionStrategy == null ? NON_PROMOTION : promotionStrategy;
    }
}