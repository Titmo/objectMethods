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
    public boolean equals(Object other) {
        if (this.getClass()!=other.getClass()) {
            return false;
        }
        Author crimeAndPunishment = (Author) other;
        return authorName.equals(crimeAndPunishment.authorName);
    }
    public int hashCode() {
        return java.util.Objects.hash(authorName);
    }
}
