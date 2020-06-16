package delegation;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Fcb
 * @date 2020/6/16
 * @description spring中以delegate结尾的一般是委派，dispatchServlet也是委派。
 */
public class Leader {
    //预先知道员工的特长、特征，分发任务
    private Map<String, Employee> employeeMap = new HashMap<>();

    public Leader() {
        employeeMap.put("加密", new EmployeeA());
        employeeMap.put("架构", new EmployeeB());
    }

    public void doing(String command) {
        employeeMap.get(command).doing(command);
    }
}
