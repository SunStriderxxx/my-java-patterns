package singleton;

/**
 * @Author: Fcb
 * @Date: 2019/3/6
 * @Description: 静态内部类单例,延迟加载,线程安全
 */
public class StaticInnerClassSingleton {

    private static class Singleton{
        private static final StaticInnerClassSingleton SINGLETON = new StaticInnerClassSingleton();
    }

    private StaticInnerClassSingleton(){}

    public static StaticInnerClassSingleton getInstance(){
        return Singleton.SINGLETON;
    }
}
