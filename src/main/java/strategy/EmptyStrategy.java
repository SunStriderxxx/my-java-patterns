package strategy;

/**
 * @author Fcb
 * @date 2020/6/16
 * @description 无优惠
 */
public class EmptyStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
