package org.example;
import java.util.Date;
import java.util.Random;

public class Item {
    private String title;
    private String genre;
    private Date releasedate;
    private Date rentDate ;
    private Date returnDate;
    private  int ID;
    boolean available = true;


    public Item(String title , String genre , Date releasedate , int ID ) {
        this.title = title;
        this.genre = genre;
        this.releasedate = releasedate;
        this.ID =ID ;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public Date getReleasedate() {
        return releasedate;
    }

    public int getID() {
        return ID;
    }

    public Date getRentDate() {
        return rentDate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String show(){
        return "ID : "+ID+"Name : "+title + "Genre : "+genre +"Release Date : "+releasedate+ " ";
    }

    public long rentalfee(){
        System.out.println("To rent an item you have to pay 2$ per day");
        Date returnDate = new Date();
        long difference = returnDate.getTime() - rentDate.getTime() ;
        long fee = difference * 2;
        return fee;
    }

}
