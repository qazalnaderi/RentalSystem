package org.example;
import java.util.Date;

public class Movie extends Item{
    private String cast;
    private String director;

    public Movie(String title , String genre , Date releasedate , int ID , String cast , String director){
        super(title ,  genre , releasedate ,  ID);
        this.cast = cast;
        this.director = director;
    }

    @Override
    public String show() {
        super.show();
        return "Cast : "+cast+ "Director : "+ director;
    }

    public String getCast() {
        return cast;
    }

    public String getDirector() {
        return director;
    }



}
