package org.example;
import java.util.Date;

public class Book extends Item{
    private String author;
    private String publisher;

    public Book(String title , String genre , Date releasedate , int ID , String author , String publisher){
        super(title ,  genre , releasedate ,  ID);
        this.author = author;
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public String show() {
        super.show();
        return "Author : "+ author + "Publisher : "+publisher ;
    }
//    public void rentBook(){
//
//    }
//    public void returnBook(){
//
//    }
}
