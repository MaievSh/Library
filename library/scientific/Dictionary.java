package library.scientific;

public class Dictionary extends ScientificBooks{

    public Dictionary (String author, String book, String description, int publishing){
        super(author, book, description, publishing);
    }

    public void printInformation () {
        System.out.println (getAuthor());
        System.out.println (getBook());
        System.out.println (getDescription());
        System.out.println (getPublishing());
    }
}
