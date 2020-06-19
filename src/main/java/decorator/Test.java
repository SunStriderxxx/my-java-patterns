package decorator;

/**
 * @author Fcb
 * @date 2020/6/18
 * @description
 */
public class Test {

    public static void main(String[] args) {
        Pancake pancake = new BasePancake();
        System.out.println(pancake.getMsg() + ",总价格:" + pancake.getPrice());

        //加一个鸡蛋
        Pancake pancakeWithEgg = new EggDecorator(pancake);
        System.out.println(pancakeWithEgg.getMsg() + ",总价格:" + pancakeWithEgg.getPrice());
        //再加一个鸡蛋
        Pancake pancakeWith2Egg = new EggDecorator(pancakeWithEgg);
        System.out.println(pancakeWith2Egg.getMsg() + ",总价格:" + pancakeWith2Egg.getPrice());
    }
}
