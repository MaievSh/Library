package library;

import library.entertaining.EntertainingBooks;
import library.entertaining.Action;
import library.entertaining.Crime;
import library.entertaining.PostApocalyptics;
import library.entertaining.SciFi;
import library.scientific.ScientificBooks;
import library.scientific.Dictionary;
import library.scientific.Encyclopedias;
import library.scientific.Classics;
import library.сhildish.ChildishBooks;
import library.сhildish.Tales;
import library.сhildish.PictureBooks;

public class Executor {

    public static void main(String[] args) {

        PictureBooks pictureBooks = new PictureBooks("Gorman", "Kolobok", "This is book about russia pie", 1982);
        pictureBooks.printInfoPictureBooks();

        Encyclopedias encyclopedias = new Encyclopedias("Kiriev", "Encyclopedia of gachi", "This is encyclopedia about real man who win our life by fighting in a gym", 2011);
        encyclopedias.printInfoEncyclopedias();

    }
}
