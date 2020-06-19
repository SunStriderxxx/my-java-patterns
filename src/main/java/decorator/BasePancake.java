package decorator;

/**
 * @author Fcb
 * @date 2020/6/18
 * @description
 */
public class BasePancake extends Pancake {

    @Override
    public String getMsg() {
        return "煎饼";
    }

    @Override
    public int getPrice() {
        return 5;
    }
}
