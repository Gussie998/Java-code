package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * User:DELL
 * Date:2021-01-18
 * Time:10:02
 */
public class FindOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("input the name of book you find>>");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for(int i=0;i<bookList.getUsedSize();i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)) {
                System.out.println(book);
                return;
            }
        }
        System.out.println("no such book here!");

    }
}
