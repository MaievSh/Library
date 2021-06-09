package library;

import library.сhildish.ChildishBooks;
import library.сhildish.PictureBooks;
import library.сhildish.Tales;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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

    public GoodFeedback() {
        listOfPictureBooks = new ArrayList<>();
        listOfTales = new LinkedList<>();
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
}
