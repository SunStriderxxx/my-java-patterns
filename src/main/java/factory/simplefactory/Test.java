package factory.simplefactory;

import factory.IPhone;

/**
 * @author Fcb
 * @date 2020/6/13
 * @description
 */
public class Test {

    public static void main(String[] args) {
        SimpleIPhoneFactory factory = new SimpleIPhoneFactory();

        IPhone iPhone = factory.makePhone("iphoneX");
        iPhone.call();
    }
}
