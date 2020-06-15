package proxy.dynamicproxy;

import proxy.Person;

/**
 * @author Fcb
 * @date 2020/6/15
 * @description
 */
public class Girl implements Person {

    @Override
    public void findLove() {
        System.out.println("动态找对象");
    }

    public void sleep() {
        System.out.println("休息一下");
    }
}
