/**
 * Created by stephenboynton on 6/29/17.
 */
public class Window {
    private int height;
    private int width;
    private boolean closed;

    public Window(int height, int width, boolean closed) {
        this.height = height;
        this.width = width;
        this.closed = closed;
    }

    public void closeWindow () {
        if (closed == true) {
            System.out.println("It's already clsoed");
        } else {
            System.out.println("Closing window!");
            closed = true;
        }
    }

    public void openWindow () {
        if (closed == false) {
            System.out.println("It's already open");
        } else {
            System.out.println("Opening window!");
            closed = true;
        }
    }
}
