package library;
import library.scientific.Classics;
import library.сhildish.ChildishBooks;
import library.сhildish.PictureBooks;
import library.сhildish.Tales;
import library.Menu;

import java.util.*;

public class GoodFeedback {
    private Books books;


    public void setBooks(Books books){
     this.books =books;
      }
      public Books getBooks(){
        return this.books;
      }

    private List<PictureBooks> listOfPictureBooks;
    private List<Tales> listOfTales;

    private Set<Classics> setOfClassics;

    public GoodFeedback() {
        listOfPictureBooks = new ArrayList<>();
        listOfTales = new LinkedList<>();
        setOfClassics = new HashSet<Classics>();
    }

    public void removeBook(Tales tales) {
        listOfTales.remove(tales);
    }

    public void removeBook(PictureBooks pictureBooks) {
        listOfPictureBooks.remove(pictureBooks);
    }

    public void setPictureBooks(PictureBooks pictureBooks) {
        listOfPictureBooks.add(pictureBooks);
    }
    public void setTales(Tales tales) {
        listOfTales.add(tales);
    }

    public List<PictureBooks> getlistOfPictureBooks() {
        return listOfPictureBooks;
    }

    public List<Tales> getlistOfTales() {
        return listOfTales;
    }

    public void setClassics (Classics classics) {
        setOfClassics.add(classics);
    }

    public Set<Classics> getSetOfClassics(){
        return setOfClassics;
    }
}
