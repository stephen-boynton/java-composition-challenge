/**
 * Created by stephenboynton on 6/29/17.
 */
public class Room {

    private Bed bed;
    private BookShelf bookShelf;
    private Window myWindow;

    public Room(Bed bed, BookShelf bookShelf, Window window) {
        this.bed = bed;
        this.bookShelf = bookShelf;
        this.myWindow = myWindow;
    }

    public void window () {
        myWindow.openWindow();
        myWindow.closeWindow();
    }

    public void inspectBooks () {
        bookShelf.inspectBooks();
    }

    public void layDown () {
        bed.getInBed();
    }
}
