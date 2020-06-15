package proxy.staticproxy;

/**
 * @author Fcb
 * @date 2020/6/15
 * @description
 */
public class Test {

    public static void main(String[] args) {
        Father father = new Father(new Son());
        father.findLove();
    }
}
