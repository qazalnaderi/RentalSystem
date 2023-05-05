import java.util.Date;
public class Rental {
    private int id;
    private Movie movie;
    private Customer customer;
    private Date rentalDate;
    private Date returnDate  ;

    public Rental(Movie movie , Customer customer , int id) {
        this.movie = movie;
        this.customer = customer;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Movie getMovie() {
        return movie;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }
    }
}
