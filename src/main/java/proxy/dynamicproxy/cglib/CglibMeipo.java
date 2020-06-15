package proxy.dynamicproxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Fcb
 * @date 2020/6/15
 * @description cglib动态代理，通过生成 继承目标类的 代理类 来实现，生成代理更复杂 生成效率低，调用效率高（生成了方法调用具体类）
 * 不能代理final类 和增强final方法
 */
public class CglibMeipo implements MethodInterceptor {

    private Object target;

    public Object getInstance(Object target) {
        this.target = target;
        //代理工具类
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib方法增强：before");
        methodProxy.invokeSuper(o, objects);
        System.out.println("cglib方法增强：after");
        return null;
    }
}
