package proxy.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Fcb
 * @date 2020/6/15
 * @description jdk动态代理，对接口的方法实现增强。代理对象必须要有接口。
 * 生成逻辑较简单，调用效率一般，因为是通过反射调用
 * 不能代理无接口的类，和类中的非重写方法
 */
public class JdkMeipo implements InvocationHandler {

    private Object target;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("jdk方法增强：before");
        Object o = method.invoke(target);
        System.out.println("jdk方法增强：after");
        return o;
    }

    public Object getInstance(Object target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }
}
