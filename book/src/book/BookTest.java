package book;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("Alice in Wonderland", "Lewis Carroll", 1865, 8.0f);
        Book book2 = new Book("1984", "Джордж Оруэлл", 1949, 8.45f);
        System.out.println(book1.getName()+" by "+ book1.getAuthor() + " has rate "+ book1.getRating());
        System.out.println(book2.getName()+" by "+book2.getAuthor()+ " was released in "+ book2.getYear());
    }
}
