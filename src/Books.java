/**
 * Created by stephenboynton on 6/29/17.
 */
public class Books {
    private int trash;
    private int literary;
    private int popular;

    public Books(int trash, int literary, int popular) {
        this.trash = trash;
        this.literary = literary;
        this.popular = popular;
    }

    public void readTrash (){
        System.out.println("Her breasts heaved like .... melons?");
    }

    public void readLiterary () {
        System.out.println("This... is above your reading level.");
    }

    public void readPopular () {
        System.out.println("George RR Martin is pretty good, but when will he finish Ice & Fire???");
    }
}
