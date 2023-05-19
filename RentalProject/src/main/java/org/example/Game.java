package org.example;
import java.util.Date;

public class Game extends Item{
    private String publisher;
    private String platform;
    private String director;

    public Game( int ID , String title , String genre , Date releasedate,String director , String publisher , String platform){
        super(title ,  genre , releasedate ,  ID);
        this.director = director;
        this.publisher = publisher;
        this.platform = platform;
    }

    @Override
    public String show() {
        super.show();
        return "Director:" +director+"Publisher : "+ publisher + "Platform :" +platform  ;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getPlatform() {
        return platform;
    }

    public String getDirector() {
        return director;
    }
    //    public void rentGame(){
//
//    }
//    public void returnGame(){
//
//    }
}
