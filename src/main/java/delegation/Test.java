package delegation;

/**
 * @author Fcb
 * @date 2020/6/16
 * @description
 */
public class Test {

    public static void main(String[] args) {
        new Boss().command("加密", new Leader());
        new Boss().command("架构", new Leader());
    }
}
