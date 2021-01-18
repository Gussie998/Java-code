package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * User:DELL
 * Date:2021-01-18
 * Time:10:03
 */
public class BorrowOperation implements IOperation {
    public  void work(BookList bookList){
        Scanner scanner = new Scanner(System.in);
        System.out.print("要借阅的图书名称：");
        String name =scanner.nextLine();
        for(int i=0;i<bookList.getUsedSize();i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)) {
               book.setStatus(true);
                return;
            }
            System.out.println("no this book");
        }

    }
}
