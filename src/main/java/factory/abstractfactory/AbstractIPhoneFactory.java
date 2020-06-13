package factory.abstractfactory;

import factory.IPhone;

/**
 * @author Fcb
 * @date 2020/6/14
 * @description
 */
public interface AbstractIPhoneFactory {

    IPhone makePhone();

    Chip makeAirPods();

    Camera makeMac();
}
