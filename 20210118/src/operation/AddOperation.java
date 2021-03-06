package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * User:DELL
 * Date:2021-01-18
 * Time:10:02
 */
public class AddOperation implements IOperation {

    @Override
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("图书名称：");
        String name =scanner.nextLine();
        System.out.print("图书作者：");
        String author =scanner.nextLine();
        System.out.print("图书价格:");
        int price =scanner.nextInt();
        System.out.print("图书类型:");
        String type =scanner.next();
        Book book = new Book(name,author,price,type);
        int currentSize = bookList.getUsedSize();
        bookList.setBooks(currentSize,book);
        bookList.setUsedSize(currentSize+1);



    }
}
