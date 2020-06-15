package proxy.staticproxy;

import proxy.Person;

/**
 * @author Fcb
 * @date 2020/6/15
 * @description
 */
public class Son implements Person {

    @Override
    public void findLove() {
        System.out.println("找对象");
    }
}
