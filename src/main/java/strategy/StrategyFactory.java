package strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Fcb
 * @date 2020/6/16
 * @description
 */
public class StrategyFactory {

    private static Map<String, PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();

    private static final PromotionStrategy NON_PROMOTION_STRATEGY = new EmptyStrategy();

    static {
        PROMOTION_STRATEGY_MAP.put("COUPON", new CouponStrategy());
        PROMOTION_STRATEGY_MAP.put("CASHBACK", new CashbackStrategy());
    }

    private StrategyFactory() {

    }

    public static PromotionStrategy getPromotionStrategy(String promotionKey) {
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);
        return promotionStrategy == null ? NON_PROMOTION_STRATEGY : promotionStrategy;
    }
}
