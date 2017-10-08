/**
 * Created by stephenboynton on 6/29/17.
 */
public class Bed {

    private String size;
    private boolean made;
    private int pillows;

    public Bed(String size, boolean made, int pillows) {
        this.size = size;
        this.made = made;
        this.pillows = pillows;
    }

    public void getInBed () {
        System.out.println("You lay in the soft sheets and drift away to dreamland.");
        made = false;
    }

    public void makeBed () {
        if (made == true) {
            System.out.println("The bed... is already made.");
        } else {
            System.out.println("You make the bed.");
        }
    }
}
