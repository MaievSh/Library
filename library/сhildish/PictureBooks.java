package library.сhildish;

import library.Books;

public class PictureBooks extends ChildishBooks{

    private String Book;

    public PictureBooks () {

    }

    public PictureBooks (String author, String book, String description, int publishing){
        super(author, book, description, publishing);
    }

    @Override
    public void printInfo(){
        System.out.println("This info about Picture books " + getBook());
    }

    @Override
    public void changeAuthor(String author) {

    }
}
