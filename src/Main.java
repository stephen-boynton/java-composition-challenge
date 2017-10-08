/**
 * Created by stephenboynton on 6/29/17.
 */
public class Main {

    public static void main(String[] args) {
        Books books = new Books(23, 2, 5);
        BookShelf bookShelf = new BookShelf(books, 3);
        Window myWindow = new Window(50, 23, true);
        Bed bed = new Bed("california king", true, 8);
        Room room = new Room(bed, bookShelf, myWindow);

        room.inspectBooks();
        room.layDown();
        room.window();
    }

}
