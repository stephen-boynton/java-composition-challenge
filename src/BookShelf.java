/**
 * Created by stephenboynton on 6/29/17.
 */
public class BookShelf {
    private Books books;
    private int shelves;


    public BookShelf(Books books, int shelves) {
        this.books = books;
        this.shelves = shelves;
    }

    public void inspectBooks () {
        System.out.println(books);
        System.out.println("Ugh... not very good taste...");
    }


}
