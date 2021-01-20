/**
 * User:DELL
 * Date:2021-01-19
 * Time:16:30
 */

class UserError extends Exception {
    public UserError(String message) {
        super(message);
    }
}
class PasswordError extends Exception {
    public PasswordError(String message) {
        super(message);
    }
}
public class TestDemo2 {
    private static String userName = "admin";
    private static String password = "123";

    public static void main(String[] args) {
        try {
            login("admin", "1234");
        } catch (UserError userError) {
            userError.printStackTrace();
        } catch (PasswordError passwordError) {
            passwordError.printStackTrace();
        }
    }
    public static void login(String userName, String password) throws UserError,
            PasswordError {
        if (!TestDemo2.userName.equals(userName)) {
            throw new UserError("用户名错误");
        }
        if (!TestDemo2.password.equals(password)) {
            throw new PasswordError("密码错误");
        }
        System.out.println("登陆成功");
    }
}
