public class Main {
    public static void main(String[] args) {
        Author authorWarAndPeace = new Author("Л.Н.Толстой");
        Book warAndPeace = new Book("Война и мир", authorWarAndPeace, 1867);
        Book warAndPeace2 = new Book("Война и мир", authorWarAndPeace, 1867);
        Author authorCrimeAndPunishment = new Author("Ф.М.Достоевский");
        Book crimeAndPunishment = new Book("Преступление и наказание",authorCrimeAndPunishment,1866);
        System.out.println(warAndPeace);
        System.out.println(crimeAndPunishment);
        System.out.println(authorWarAndPeace);
        System.out.println(authorCrimeAndPunishment);
        System.out.println("Сравнение одинаковых книг: " + warAndPeace.equals(warAndPeace2));
        System.out.println("Сравнение разных книг: " + authorWarAndPeace.equals(authorCrimeAndPunishment));
        Book war=warAndPeace;
        System.out.println(war.hashCode());
        System.out.println(warAndPeace.hashCode());
        System.out.println(authorWarAndPeace.hashCode());
    }
}