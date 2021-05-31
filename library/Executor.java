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
        pictureBooks.printInfo();

        Encyclopedias encyclopedias = new Encyclopedias("Mira Filippova", "Encyclopedia of everything in the world", "book of everything in the world", 2015,"good book", 1200);
        encyclopedias.printInfo();

        Encyclopedias bigEncyclopedias = new Encyclopedias("Tatiana Korneva","Great children's encyclopedia", "Where did I come from?",2000);
        bigEncyclopedias.printInfo();

        bigEncyclopedias.changeAuthor("Tatiana Novik");
        bigEncyclopedias.printInfo();

        Dictionary dictionary = new Dictionary("Nadezhda Nadezhkina", "Japan-Russian dictionary", "translate words",1986, " Japan-Russian" );
        dictionary.printInfo();

        Classics classics = new Classics("L. N. Tolstoy", "World and war", " epic novel",1865, " Russia" );
        classics.printInfo();
    }
}



