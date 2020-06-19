package decorator;

/**
 * @author Fcb
 * @date 2020/6/18
 * @description
 */
public class EggDecorator extends PancakeDecorator {

    public EggDecorator(Pancake pancake) {
        super(pancake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "+1个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 1;
    }
}
