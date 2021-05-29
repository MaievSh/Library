package library.entertaining;
import library.Books;

public class PostApocalyptics extends EntertainingBooks  {

    private String armament;

    public PostApocalyptics(){

    }

    public PostApocalyptics(String author, String book, String description, int publishing) {
        super(author, book, description, publishing);
        setArmament("sdfsfs");

}
    public void printInfoPostApocalyptics() {
        System.out.println ("Armament is " + getArmament());
    }


    public String getArmament() {
        return armament;
    }

    public void setArmament(String armament) {
        this.armament = armament;
    }


}