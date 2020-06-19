package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Fcb
 * @date 2020/6/18
 * @description
 */
public class MyObserver implements Observer {

    private String name;

    public MyObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Forum forum = (Forum) o;
        Question question = (Question) arg;
        System.out.println("===============");
        System.out.println(name + "观察者您好，" + "您收到了来自" + question.getUserName()
         + "的提问！问题内容如下：" + question.getContent());
    }
}
