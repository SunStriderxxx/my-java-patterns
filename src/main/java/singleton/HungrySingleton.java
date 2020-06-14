package singleton;

/**
 * @Author: Fcb
 * @Date: 2019/3/6
 * @Description: 饿汉式单例, 线程安全, 没有延迟加载, 但类多次加载会有多个实例
 */
public class HungrySingleton {

    private static final HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return singleton;
    }
}
