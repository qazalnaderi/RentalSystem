import java.time.LocalDate;
import java.util.Date;
import java.util.*;
public class Rental {
    private int id;
    private Movie movie;
    private Customer customer;
    private LocalDate rentalDate;
    private LocalDate returnDate  = rentalDate.plusDays(7) ;

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

    public LocalDate getRentalDate() {
        return rentalDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setRentalDate(LocalDate rentalDate) {
        this.rentalDate = rentalDate;
    }
}
