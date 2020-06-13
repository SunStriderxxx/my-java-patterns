package factory.factorymethod;

import factory.IPhone;
import factory.IPhoneX;

/**
 * @author Fcb
 * @date 2020/6/14
 * @description
 */
public class IPhoneXFactory implements IPhoneFactory {

    public IPhone makePhone() {
        return new IPhoneX();
    }
}
