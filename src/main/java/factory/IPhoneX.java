package factory;

import factory.IPhone;

/**
 * @author Fcb
 * @date 2020/6/13
 * @description
 */
public class IPhoneX implements IPhone {

    public void call() {
        System.out.println("本条消息来自iphoneX");
    }
}
