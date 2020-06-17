package template;

/**
 * @author Fcb
 * @date 2020/6/17
 * @description
 */
public class BigDataCourse extends NetworkCourse {

    private boolean needHomeworkFlag = false;

    @Override
    void chechHomework() {
        System.out.println("检查大数据的课后作业");
    }

    @Override
    protected boolean needHomework() {
        return needHomeworkFlag;
    }
}
