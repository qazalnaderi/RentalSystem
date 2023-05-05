import java.util.Date;
import java.util.Random;
//Setter for id????

public class Item {
    private String title;
    private String genre;
    private Date releasedate;
    private Date rentDate ;
    Random random = new Random();
    long  low = 1;
    long high = 10000;
    private long ID = random.nextLong(high- low) + low;
    public Item(String title , String genre , Date releasedate , long ID ) {
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

    public long getID() {
        return ID;
    }

    public Date getRentDate() {
        return rentDate;
    }

    public String show(){
        return "ID : "+ID+"Name : "+title + "Genre : "+genre +"Release Date : "+releasedate+ " ";
    }

//    public int rentalfee(){
//        System.out.println("To rent an item you have to pay 2$ per day");
//        Date returnDate = new Date();
//        int difference = returnDate - returnDate ;
//        int fee = difference * 2;
//        return fee;
//    }

}
