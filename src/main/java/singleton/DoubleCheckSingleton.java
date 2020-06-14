package singleton;

import java.io.Serializable;

/**
 * @Author: Fcb
 * @Date: 2019/3/6
 * @Description: 双重锁检查单例, 延迟加载且线程安全
 */
public class DoubleCheckSingleton implements Serializable {

    private static volatile DoubleCheckSingleton singleton;

    private DoubleCheckSingleton() {
        //防止反射创建对象，破坏单例
        if (singleton != null) {
            throw new RuntimeException("不允许创建多个实例！");
        }
    }

    public static DoubleCheckSingleton getInstance() {
        if (singleton == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }

    //防止序列化破坏单例
    private Object readResolve() {
        return singleton;
    }

}
