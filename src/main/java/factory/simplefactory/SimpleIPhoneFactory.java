package factory.simplefactory;

import factory.IPhone;
import factory.IPhone11;
import factory.IPhoneX;

/**
 * @author Fcb
 * @date 2020/6/13
 * @description
 */
public class SimpleIPhoneFactory {

    public IPhone makePhone(String name) {
        if ("iphone11".equals(name)) {
            return new IPhone11();
        } else if ("iphoneX".equals(name)) {
            return new IPhoneX();
        } else {
            return null;
        }
    }
}
