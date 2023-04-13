import java.util.Objects;

public class Book {
    private String bookName;
    private Author authorName;
    private int year;

    public Book(String bookName, Author authorName, int year) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.year = year;

    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return authorName ;
    }

    public int getYear() {
        return year;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String toString() {
        return "Название книги:"+getBookName()+"; Автор:"+authorName+"; Год выпуска:"+getYear();
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(bookName, book.bookName) && Objects.equals(authorName, book.authorName);
}
    public int hashCode() {
        return Objects.hash(bookName, authorName, year);
    }
}
