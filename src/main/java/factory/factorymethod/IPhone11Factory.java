package factory.factorymethod;

import factory.IPhone;
import factory.IPhone11;

/**
 * @author Fcb
 * @date 2020/6/14
 * @description
 */
public class IPhone11Factory implements IPhoneFactory {

    public IPhone makePhone() {
        return new IPhone11();
    }
}
