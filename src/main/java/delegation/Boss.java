package delegation;

/**
 * @author Fcb
 * @date 2020/6/16
 * @description
 */
public class Boss {

    public void command(String command, Leader leader) {
        leader.doing(command);
    }
}
