import book.BookList;
import user.AdmainUser;
import user.NormalUser;
import user.User;
import java.util.Scanner;

/**
 * User:DELL
 * Date:2021-01-18
 * Time:9:49
 */
public class Main {
    public static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = scanner.nextLine();
        System.out.println("身份：1>>>管理员 0>>>普通用户");
        int choice = scanner.nextInt();
        if(choice==1) {
            return new AdmainUser(name);
        } else {
            return new NormalUser(name);
        }

    }

    public static void main(String[] args) {
        BookList bookList = new BookList();
        User user = login();
        while (true){
            int choice = user.menu();
            user.doOperation(choice,bookList);
        }


    }
}
