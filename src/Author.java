import java.util.Objects;

public class Author {
    String authorName;

    public Author(String authorName) {
        this.authorName=authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public  String toString() {
        return "Автор "+authorName;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(authorName, author.authorName);
    }


    public int hashCode() {
        return Objects.hash(authorName);
    }
}
