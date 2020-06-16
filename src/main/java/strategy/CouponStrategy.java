package strategy;

/**
 * @author Fcb
 * @date 2020/6/16
 * @description
 */
public class CouponStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("领取优惠券，课程价格直接减去优惠券面值抵扣");
    }
}
