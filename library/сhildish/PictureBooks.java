package library.сhildish;

import library.Books;

public class PictureBooks extends ChildishBooks{

    private String Book;

    public PictureBooks () {

    }

    public PictureBooks (String author, String book, String description, int publishing){
        super(author, book, description, publishing);
    }

    public void printInfoPictureBooks() {
        printInfo();
        System.out.println (getBook());
    }

}
