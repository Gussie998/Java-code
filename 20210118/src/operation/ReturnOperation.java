package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * User:DELL
 * Date:2021-01-18
 * Time:10:03
 */
public class ReturnOperation implements  IOperation {
    @Override
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("要归还的图书名称：");
        String name =scanner.nextLine();
        int i=0;
        for(;i<bookList.getUsedSize();i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)) {
                book.setStatus(false);
                return;
            }
        }
        System.out.println("no such book");
    }
}
