package operation;

import book.Book;
import book.BookList;

/**
 * User:DELL
 * Date:2021-01-18
 * Time:10:03
 */
public class DisplayOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        for(int i=0;i<bookList.getUsedSize();i++) {
            Book book = bookList.getBook(i);
            System.out.println(book);
            }
    }
}
