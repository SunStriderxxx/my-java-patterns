package singleton;

/**
 * @Author: Fcb
 * @Date: 2019/3/6
 * @Description: 懒汉式单例,延迟加载,线程不安全
 */
public class LazySingleton {

    private static LazySingleton singleton;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if (singleton == null){
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
