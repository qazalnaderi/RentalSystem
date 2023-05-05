import java.util.ArrayList;
import java.util.Date;

public class Game extends Item{
    private String publisher;
    private String platform;

    public Game(String title , String genre , Date releasedate , int ID , String publisher , String platform){
        super(title ,  genre , releasedate ,  ID);
        this.publisher = publisher;
        this.platform = platform;
    }

    @Override
    public String show() {
        super.show();
        return "Publisher : "+ publisher + "Platform :" +platform  ;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getPlatform() {
        return platform;
    }

    public void rentGame(){

    }
    public void returnGame(){

    }
}
