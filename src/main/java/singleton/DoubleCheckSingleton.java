package singleton;

import java.io.Serializable;

/**
 * @Author: Fcb
 * @Date: 2019/3/6
 * @Description: 双重锁检查单例,延迟加载且线程安全,有些说法觉得单例不能防止序列化,其实加上readSolve()方法就可以了
 */
public class DoubleCheckSingleton implements Serializable {

    private static volatile DoubleCheckSingleton singleton;

    private DoubleCheckSingleton(){}

    public static DoubleCheckSingleton getInstance(){
        if (singleton == null){
            synchronized (DoubleCheckSingleton.class){
                if (singleton == null){
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }

    private Object readSolve(){
        return singleton;
    }

}
