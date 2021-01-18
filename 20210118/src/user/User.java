package user;

import book.BookList;
import operation.IOperation;

/**
 * User:DELL
 * Date:2021-01-18
 * Time:9:49
 */
public abstract class User {
    public String name;
    public IOperation[] operations;

    public User (String name){
        this.name=name;
    }

    public abstract int menu();

    public void doOperation(int choice, BookList bookList){
        this.operations[choice].work(bookList);
    }
}
