package library.scientific;

public class Encyclopedias extends ScientificBooks{

    private String Book;

    public Encyclopedias (String author, String book, String description, int publishing){
        super(author, book, description, publishing);
    }

    public void printInformation () {
        System.out.println (getAuthor());
        System.out.println (getBook());
        System.out.println (getDescription());
        System.out.println (getPublishing());
    }

    public void printInfoEncyclopedias() {
        printInfo();
        System.out.println (getBook());
    }
}
