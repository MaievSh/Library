package library;

import library.entertaining.Action;
import library.entertaining.Crime;
import library.entertaining.PostApocalyptic;
import library.entertaining.SciFi;
import library.scientific.Dictionary;
import library.scientific.Encyclopedias;
import library.scientific.Classics;
import library.сhildish.PictureBooks;
import library.сhildish.Tales;

import java.util.Scanner;

public class Executor {


    public static void main(String[] args) {

        PictureBooks pictureBooks = new PictureBooks("Gorman", "Kolobok", "This is book about russia pie", 1982);

        Tales tales = new Tales("Daisy Fisher", "cinderella","is a folk tale about oppression and triumphant reward." +
                " Thousands of variants are known throughout the world. " +
                "The protagonist is a young woman living in forsaken circumstances that are suddenly changed to remarkable fortune, with her ascension to the throne via marriage.",1697,"good book");

        Encyclopedias encyclopedias = new Encyclopedias("Mira Filippova", "Encyclopedia of everything in the world", "book of everything in the world", 2015,"good book", 1200);
        encyclopedias.printInfo();

        Encyclopedias bigEncyclopedias = new Encyclopedias("Tatiana Korneva","Great children's encyclopedia", "Where did I come from?",2000);
        String bigEncyclopediasInfo = bigEncyclopedias.toString();
        System.out.println(bigEncyclopediasInfo);

        bigEncyclopedias.changeAuthor("Tatiana Novik");
        String author = bigEncyclopedias.toString();
        System.out.println(author);

        Dictionary dictionary = new Dictionary ("Nadezhda Nadezhkina", "Japan-Russian dictionary", "translate words",1986, " Japan-Russian");
        String infoDictionary = dictionary.toString();
        System.out.println(infoDictionary);

        Classics classics = new Classics ("L. N. Tolstoy", "World and war", " epic novel",1865, " Russia");
        String infoClassics = classics.toString();
        System.out.println(infoClassics);
        System.out.flush();


        GoodFeedback goodFeedback = new GoodFeedback();
        goodFeedback.setBooks(pictureBooks);
        System.out.println(goodFeedback.getBooks().getBook());
        System.out.flush();

        int index = 0;
        do {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the genre of books you are interested in: Action, Crime, Post-Apocalypse, SciFi");
        String genre = in.nextLine();

        switch (genre) {
            case "Action":
                System.out.println("You choose Action books");
                Action centerEarth = new Action("Jules Verne","Journey to the Center of the Earth","Journey to the Center of the Earth is exactly that: " +
                        "a trip to the inside of the world, which is where German professor Otto Lidenbrock theorizes that volcanic tubes will lead." +
                        "", 1984);
                centerEarth.printInfo();
                index = 10;
                break;
            case "Crime":
                System.out.println("You choose Crime books");
                Crime goneGirl = new Crime("Gillian Flynn","Gone Girl","More than any other book in the decade, Gillian Flynn’s mega-hit Gone Girl captured the essence of female rage, " +
                        "as millions of well-dressed, seemingly content women used Flynn’s fearsome takedown of the patriarchy to unleash their inner discontent",2012);
               goneGirl.printInfo();
                index = 10;
                break;
            case "Post-Apocalypse":
                System.out.println("You choose Post-Apocalypse books");
                PostApocalyptic theStand = new PostApocalyptic("Stephen King","The Stand","It’s about a plague that is accidentally unleashed upon the world from a government lab and wipes out most of humanity (save those that are mysteriously immune)," +
                        " which would be compelling enough in its own right; " +
                        "but, this being Stephen King, he, of course, has to add some supernatural elements as well.",1980);
                theStand.printInfo();
                index = 10;
                break;
            case "SciFi":
                System.out.println("You choose SciFi books");
                SciFi orwell1984 = new SciFi("George Orwell", "1984","1984 is a prime example of this," +
                        " a dystopian novel where our culture has become the victim of government surveillance and public manipulation.",1949);
               orwell1984.printInfo();
                index = 10;
                break;
        }
        index++;
    } while(index < 10);

}
}



