package strategy;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Fcb
 * @date 2020/6/16
 * @description
 */
public class Test {

//    public static void main(String[] args) {
//        PromotionActivity activity618 = new PromotionActivity(new CouponStrategy());
//        PromotionActivity activity1111 = new PromotionActivity(new CashbackStrategy());
//        activity618.excute();
//        activity1111.excute();
//    }

//    public static void main(String[] args) {
//        PromotionActivity activity = null;
//        String promotionKey = "COUPON";
//
//        if (StringUtils.equals(promotionKey, "COUPON")) {
//            activity = new PromotionActivity(new CouponStrategy());
//        } else if (StringUtils.equals(promotionKey, "CASHBACK")) {
//            activity = new PromotionActivity(new CashbackStrategy());
//        }
//    }
    public static void main(String[] args) {
        String promotionKey = "COUPON";
        PromotionActivity activity = new PromotionActivity(StrategyFactory.getPromotionStrategy(promotionKey));
        activity.excute();
    }
}
