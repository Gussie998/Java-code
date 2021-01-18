package book;

/**
 * User:DELL
 * Date:2021-01-18
 * Time:9:52
 */
public class BookList {
    private Book[] books;
    private  int usedSize;

    public BookList() {
        this.books = new Book[10];
        books[0] = new Book("三国","罗贯中",23,"小说");
        books[1] = new Book("红楼梦","曹雪芹",23,"小说");
        books[2] = new Book("西游记","吴承恩",23,"小说");
        this.usedSize = 3;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

    //尾插
    public void setBooks(int pos,Book book) {
        this.books[pos] = book;
    }

    public Book getBook(int pos) {
        return this.books[pos];
    }

}
