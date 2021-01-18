package operation;

import book.BookList;

/**
 * User:DELL
 * Date:2021-01-18
 * Time:10:04
 */
public class ExitOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统");
        System.exit(1);
    }
}
