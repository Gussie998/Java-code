package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * User:DELL
 * Date:2021-01-18
 * Time:10:02
 */
public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("要删除的图书名称：");
        String name =scanner.nextLine();
        int i=0;
        for(;i<bookList.getUsedSize();i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)) {
                break;
            }
        }
        if(i>=bookList.getUsedSize()) {
            System.out.println("no such book");
            return;
        }
        int pos=i;
        for (int j = pos; j <bookList.getUsedSize()-1 ; j++) {
            Book book = bookList.getBook(j+1);
            bookList.setBooks(j,book);

        }
        bookList.setUsedSize(bookList.getUsedSize()-1);
        System.out.println("删除完毕");

    }
}
