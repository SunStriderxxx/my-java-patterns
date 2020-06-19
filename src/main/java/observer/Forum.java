package observer;

import java.util.Observable;

/**
 * @author Fcb
 * @date 2020/6/18
 * @description jdk提供的一种观察者的实现方式
 */
public class Forum extends Observable {

    private Forum() {
        //防止反射创建对象，破坏单例
        if (Inner.FORUM != null) {
            throw new RuntimeException("不允许创建多个实例！");
        }
    }

    private String name = "博客园";

    public String getName() {
        return name;
    }

    public static Forum getInstance() {
        return Inner.FORUM;
    }

    private static class Inner {
        private static final Forum FORUM = new Forum();
    }

    public void publishQuestion(Question question) {
        System.out.println(question.getUserName() + "在" + this.getName() + "问：" + question.getContent());
        setChanged();
        notifyObservers(question);
    }



}
