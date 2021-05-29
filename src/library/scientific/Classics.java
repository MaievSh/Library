package library.scientific;

public class Classics extends ScientificBooks{

    public Classics (String author, String book, String description, int publishing){
        super(author, book, description, publishing);
    }

    public void printInformation () {
        System.out.println (getAuthor());
        System.out.println (getBook());
        System.out.println (getDescription());
        System.out.println (getPublishing());
    }
}
