package org.example;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class RentalStore {
    private ArrayList<Movie> movies;
    private ArrayList<Customer> customers;

    public void register(Customer customer){
        for (Customer c : customers) {
            if (c.getID()== customer.getID() && c.getName() == customer.getName() && c.getEmail()== customer.getEmail() && c.getAddress() == customer.getAddress()){
                System.out.println("Customer already exists in the system.");
                break;
            }
            else {
                customers.add(customer);
                System.out.println("Registration completed successfully.");
                System.out.println("Welcome to our rental system!");
            }
        }
    }
    public void addMovie(Movie movie){
        for (Movie m : movies) {
            if (m.getID() == movie.getID() && m.getTitle() == movie.getTitle() && m.getCast() == movie.getCast() && m.getGenre() == movie.getGenre() ){
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
            if (m.getID()==movie.getID() && movie.isAvailable()){
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
            if(movie.getID()== movie.getID()  && item.isAvailable()){
                String fullID = Integer.toString(movie.getID()) + Integer.toString(customer.getID());
                int mainID = Integer.parseInt(fullID);
                Rental rental = new Rental(movie , customer , mainID);
                Date now = new Date();
                rental.setRentalDate(now);
                customer.getRentals().add(rental);
                System.out.println("Movie rented successfully!");
                System.out.println("Attention : You have 7 days from now to return this movie or you will have to pay fine :) . ");
                movie.setAvailable(false);
            }
            else if (movie.getID()!= movie.getID() && !item.isAvailable()) {
                System.out.println("Movie is has already been rent by another costumer.");
                break;
            }
            else {
                System.out.println("Movie wasn't found.");
            }
        }
    }
    public void returnMovie(Rental rental){
        int i = 0;
        for (Customer customer  : customers) {
            if (customer.getRentals().get(i).getId()== rental.getId()){
                customers.remove(customer);
                customer.getRentals().remove(i);
                rental.getMovie().setAvailable(true);
                //rental.setRentalDate();
                System.out.println("Deleting done successfully.");
                break;
            }
            i++;
        }
    }
    public Customer getCustomerById(int id){
        for (Customer c : customers) {
            if(c.getID() == id){
                return c;
            }
        }
        return null;
    }
    public Movie getMovieById(int id){
        for (Movie m : movies) {
            if (m.getID() == id){
                return m;
            }
        }
        return null;
    }
}
