package proxy.staticproxy;

import proxy.Person;

/**
 * @author Fcb
 * @date 2020/6/15
 * @description 咕泡视频写的静态代理，代理类持有被代理类的引用，然后方法增强
 */
public class Father {

    private Person person;

    public Father(Person person) {
        this.person = person;
    }

    public void findLove() {
        System.out.println("父亲出马介绍");
        person.findLove();
        System.out.println("介绍成功");
    }
}
