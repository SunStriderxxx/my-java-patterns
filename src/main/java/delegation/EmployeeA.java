package delegation;

/**
 * @author Fcb
 * @date 2020/6/16
 * @description
 */
public class EmployeeA implements Employee {

    @Override
    public void doing(String command) {
        System.out.println("我是员工A，我开始干活了，我擅长加密，执行" + command);
    }
}
