package factory.abstractfactory;

import factory.IPhone;
import factory.IPhoneX;

/**
 * @author Fcb
 * @date 2020/6/14
 * @description
 */
public class IPhoneXFactory implements AbstractIPhoneFactory {

    public IPhone makePhone() {
        return new IPhoneX();
    }

    public Chip makeAirPods() {
        return null;
    }

    public Camera makeMac() {
        return null;
    }
}
