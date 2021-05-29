package library.entertaining;

import library.Books;

public abstract class EntertainingBooks {

    private String author;
    private String book;
    private String description;
    private int publishing;

public EntertainingBooks () {}

public EntertainingBooks (String author, String book, String description, int publishing) {

        this.author = author;
        this.book = book;
        this.description = description;
        this.publishing = publishing;
    }

    public void setAuthor (String author) {
        this.author = author;
    }

    public String getAuthor () {
        return this.author;
    }

    public void setBook (String Book) {
        this.book = book;
    }

    public String getBook () {
        return this.book;
    }

    public void setDescription (String Description) {
        this.description = description;
    }

    public String getDescription () {
        return this.description;
    }

    public void setPublishing (int Publishing)  {
        this.publishing = publishing;
    }

    public int getPublishing () {
        return this.publishing;
    }

    public void printInformation () {
        System.out.println (getAuthor());
        System.out.println (getBook());
        System.out.println (getDescription());
        System.out.println (getPublishing());
    }
}
