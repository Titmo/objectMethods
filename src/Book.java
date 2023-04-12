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

    public boolean equals(Object other) {
        if (this.getClass()!=other.getClass()) {
            return false;
        }
        Book crimeAndPunishment = (Book) other;
        return bookName.equals(crimeAndPunishment.bookName);
    }
    public int hashCode() {
            return java.util.Objects.hash(bookName);
    }

}
