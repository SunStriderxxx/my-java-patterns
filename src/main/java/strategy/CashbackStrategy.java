package strategy;

/**
 * @author Fcb
 * @date 2020/6/16
 * @description
 */
public class CashbackStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("返现促销，返回的金额转到支付宝账号");
    }
}
