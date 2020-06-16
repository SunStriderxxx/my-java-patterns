package strategy;

/**
 * @author Fcb
 * @date 2020/6/16
 * @description
 */
public class PromotionActivity {

    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void excute() {
        promotionStrategy.doPromotion();
    }
}
