package library.entertaining;
import library.Books;

public class PostApocalyptics extends EntertainingBooks  {

    public PostApocalyptics (String author, String book, String description, int publishing){
        super(author, book, description, publishing);
    }

    public void printInformation () {
        System.out.println (getAuthor());
        System.out.println (getBook());
        System.out.println (getDescription());
        System.out.println (getPublishing());
    }

}