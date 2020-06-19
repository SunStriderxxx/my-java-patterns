package observer.guavaVersion;

import com.google.common.eventbus.Subscribe;

/**
 * @author Fcb
 * @date 2020/6/18
 * @description
 */
public class GuavaEvent {

    @Subscribe
    public void subscribe(String str) {
        System.out.println("执行subscribe方法，传入的参数是：" + str);
    }
}
