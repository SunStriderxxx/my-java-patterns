package proxy.dynamicproxy;

import proxy.Person;
import proxy.dynamicproxy.cglib.CglibMeipo;
import proxy.dynamicproxy.jdk.JdkMeipo;

/**
 * @author Fcb
 * @date 2020/6/15
 * @description
 */
public class Test {

    public static void main(String[] args) {
        //这段代码会报错，发现jdk动态代理无法代理类本身的方法，只能代理接口中的方法
        //想了想应该是Proxy类只会去拿接口中的方法动态生成代理类，所以没有拿类本身的方法
//        Girl girl = (Girl) new Meipo().getInstance(new Girl());
//        girl.sleep();
        Person person = (Person) new JdkMeipo().getInstance(new Girl());
        person.findLove();

        Girl girl = (Girl) new CglibMeipo().getInstance(new Girl());
        girl.findLove();
    }
}
