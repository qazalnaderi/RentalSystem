import java.util.Date;

public class Movie {
    private int id;
    private String title;
    private String cast;
    private String genre;
    private String director;
    private Date releasedate;
    private Boolean Available= true;

    public Movie(int id , String title , String cast , String genre , String director , Date releasedate){
        this.id = id;
        this.title = title;
        this.cast = cast;
        this.genre = genre;
        this.director = director;
        this.releasedate = releasedate;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getDirector() {
        return director;
    }

    public Date getReleasedate() {
        return releasedate;
    }

public boolean isAvailable(){
        return Available;
}
public String getCast() {
    return cast;
}
    public void setAvailable(Boolean available) {
        Available = available;
    }


}
