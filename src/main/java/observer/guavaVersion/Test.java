package observer.guavaVersion;

import com.google.common.eventbus.EventBus;

/**
 * @author Fcb
 * @date 2020/6/18
 * @description
 */
public class Test {

    public static void main(String[] args) {
        //消息总线
        EventBus eventBus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        eventBus.register(guavaEvent);
        eventBus.post("test");
        //Guava面向的是方法
    }
}
