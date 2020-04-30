package singleton;

/**
 * @Author: Fcb
 * @Date: 2019/3/6
 * @Description: 枚举类型单例模式, 除了能解决上述问题外, 还能防止反序列化重新创建新的对象
 */
public enum EnumSingleton {
    INSTANCE;

    EnumSingleton() {

    }
}
