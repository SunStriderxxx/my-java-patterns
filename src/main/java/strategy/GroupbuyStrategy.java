package strategy;

/**
 * @author Fcb
 * @date 2020/6/16
 * @description
 */
public class GroupbuyStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("拼团，满20人成团，全团享受团购价");
    }
}
