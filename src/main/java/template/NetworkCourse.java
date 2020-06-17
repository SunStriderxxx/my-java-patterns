package template;

/**
 * @author Fcb
 * @date 2020/6/17
 * @description 模板方法模式：定义算法的骨架，允许子类为一个或多个步骤提供实现
 */
public abstract class NetworkCourse {

    protected final void createCourse() {
        //1、发布预习资料
        publishPreviewResource();
        //2、制作ppt课件
        createPPT();
        //3、在线直播
        liveVideo();
        //4、提交课件，笔记
        postNote();
        //5、提交源码
        postSource();
        //6、布置作业：有些课有作业，有些课没作业；有作业的话需要检查
        if (needHomework()) {
            chechHomework();
        }
    }

    abstract void chechHomework();

    //钩子方法：实现流程的微调
    protected boolean needHomework() {
        return false;
    }

    final void postSource() {
    }

    final void postNote() {
    }

    final void liveVideo() {
    }

    final void createPPT() {
    }

    final void publishPreviewResource() {
    }
}
