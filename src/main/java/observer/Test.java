package observer;

/**
 * @author Fcb
 * @date 2020/6/18
 * @description
 */
public class Test {

    public static void main(String[] args) {
        Forum forum = Forum.getInstance();
        MyObserver observer = new MyObserver("fcb");
        forum.addObserver(observer);
        forum.publishQuestion(new Question("小明", "观察者模式的原理"));
    }
}
