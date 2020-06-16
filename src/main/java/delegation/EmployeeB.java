package delegation;

/**
 * @author Fcb
 * @date 2020/6/16
 * @description
 */
public class EmployeeB implements Employee {

    @Override
    public void doing(String command) {
        System.out.println("我是员工B，我开始干活了，我擅长架构，执行" + command);
    }
}
