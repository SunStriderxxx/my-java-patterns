package factory.factorymethod;

/**
 * @author Fcb
 * @date 2020/6/14
 * @description
 */
public class Test {

    public static void main(String[] args) {
        IPhoneFactory factory = new IPhoneXFactory();
        factory.makePhone().call();
    }
}
