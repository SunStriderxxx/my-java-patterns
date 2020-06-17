package template;

/**
 * @author Fcb
 * @date 2020/6/17
 * @description
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("---java架构师课程---");
        NetworkCourse javaCourse = new JavaCourse();
        javaCourse.createCourse();
        NetworkCourse bigDataCourse = new BigDataCourse();
        bigDataCourse.createCourse();
    }
}
