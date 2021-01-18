package user;

import book.BookList;
import operation.*;

import java.util.Scanner;

/**
 * User:DELL
 * Date:2021-01-18
 * Time:9:49
 */
public class AdmainUser extends User {

    public AdmainUser(String name) {
        super(name);
        this.operations = new IOperation[] {
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation()
        };
    }

    @Override
    public int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("======================");
        System.out.println("hello " +this.name+" 欢迎来到图书馆");
        System.out.println("1、查找图书");
        System.out.println("2、新增图书");
        System.out.println("3、删除图书");
        System.out.println("4、显示图书");
        System.out.println("0、退出系统");
        int choice = scanner.nextInt();
        return choice;

    }
}
