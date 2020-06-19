package decorator;

/**
 * @author Fcb
 * @date 2020/6/18
 * @description
 */
public abstract class PancakeDecorator extends Pancake{

    private Pancake pancake;

    public PancakeDecorator(Pancake pancake) {
        this.pancake = pancake;
    }

    @Override
    protected String getMsg() {
        return pancake.getMsg();
    }

    @Override
    protected int getPrice() {
        return pancake.getPrice();
    }
}
