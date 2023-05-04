import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class RentalStore {
    private ArrayList<Movie> movies;
    private ArrayList<Customer> customers;


    public void register(Customer customer){
        for (Customer c : customers) {
            if (c.getId()== customer.getId() && c.getName() == customer.getName() && c.getEmail()== customer.getEmail() && c.getAddress() == customer.getAddress()){
                System.out.println("Customer already exists in the system.");
                break;
            }
            else {
                customers.add(customer);
                System.out.println("Registeration completed successfully.");
                System.out.println("Welcome to our rental system!");
            }
        }
    }
    public void addMovie(Movie movie){
        for (Movie m : movies) {
            if (m.getId() == movie.getId() && m.getTitle() == movie.getTitle() && m.getCast() == movie.getCast() && m.getGenre() == movie.getGenre() ){
                System.out.println("It seems like the movie already exists in the system");
                break;
            }
            else {
                movies.add(movie);
                System.out.println("Movie added successfully.");
            }

        }
    }
    public void removeMovies(Movie movie){
        for ( Movie m : movies) {
            if (m.getId()==movie.getId() && movie.isAvailable()){
                movies.remove(movie);
                System.out.println("Movie removed successfully.");
            }
            else{
                System.out.println("Movie can't be deleted right now.It may be rented by someone or the movie doesn't exist at all.");
            }
        }

    }
    public List<Movie> getAvailableMovies(){
        ArrayList<Movie> availablemovies = new ArrayList<>();
        for ( Movie movie : movies) {
            if (movie.isAvailable()){
                availablemovies.add(movie);
            }
        }
        System.out.println("Here you can see a list of available movies: ");
        return availablemovies;

    }
    public void rentMovie(Movie movie , Customer customer){
        for (Movie item : movies) {
            if(movie.getId()== movie.getId()  && item.isAvailable()){
                String fullID = Integer.toString(movie.getId()) + Integer.toString(customer.getId());
                int mainID = Integer.parseInt(fullID);
                Rental rental = new Rental(movie , customer , mainID);
                LocalDate now = LocalDate.now();
                rental.setRentalDate(now) ;
                customer.getRentals().add(rental);
                System.out.println("Movie rented successfully!");
                System.out.println("Attention : You have 7 days from now to return this movie or you will have to pay fine :) . ");
                movie.setAvailable(false);
            }
            else if (movie.getId()!= movie.getId() && !item.isAvailable()) {
                System.out.println("Movie is has already been rent by another costumer.");
                break;
            }
            else {
                System.out.println("Movie wasn't found.");
            }
        }
    }
    //TODO
    public void returnMovie(){


    }
    public Customer getCustomerById(int id){
        for (Customer c : customers) {
            if(c.getId() == id){
                return c;
            }
        }
        return null;
    }
    public Movie getMovieById(int id){
        for (Movie m : movies) {
            if (m.getId() == id){
                return m;
            }
        }
        return null;
    }
    public double calculateLateFee(LocalDate date){
        int fine ;
        for (Customer c : customers){
            for (Rental r : c.getRentals()) {
                if(date.compareTo(r.getReturnDate())> 7){
                    System.out.println("You returned the movie late.so now you have to pay the fee.");
                }
                    if (date.compareTo(r.getReturnDate()) <= 7){
                        System.out.println("You have to pay 2$.");
                        fine = 2;
                    }
                    else {
                        System.out.println("You have to pay 8$.");
                        fine = 8;
                    }
            }
        }
        return fine;
    }
}
