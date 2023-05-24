package org.example;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class RentalStore {
    public static ArrayList<Item> itemList = new ArrayList<>();
    public static ArrayList<Customer> customers = new ArrayList<>();
    public static ArrayList<Movie> movies = new ArrayList<>();
    public static ArrayList<Game> games= new ArrayList<>();
    public static ArrayList<Book> books = new ArrayList<>();
    public static ArrayList<Rental> rentalList = new ArrayList<>();

    public void register(Customer customer){
        for (Customer c : customers) {
            if (c.getID()== customer.getID()){
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
            if (m.getID() == movie.getID() ){
                System.out.println("It seems like the movie already exists in the system.");
                break;
            }
            else {
                movies.add(movie);
                System.out.println("Movie added successfully.");
            }
        }
    }

    public void addBook(Book book) {
        for (Book b : books) {
            if (b.getID() == book.getID() ) {
                System.out.println("It seems like the book already exists in the system.");
            } else {
                books.add(book);
                System.out.println("Book added successfully.");
            }
        }
    }

    public void addGame(Game game){
        for (Game g: games) {
            if (g.getID() == game.getID()){
                System.out.println("It seems like the game already exists in the system.");
            }
            else {
                games.add(game);
                System.out.println("Game added successfully.");
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
    public void removeBook(Book book){
        for (Book b : books) {
            if (b.getID() == book.getID() && book.isAvailable()){
                books.remove(book);
                System.out.println("Book removed successfully.");
            }
            else {
                System.out.println("Book can't be deleted right now.It may be rented by someone or the book doesn't exist at all.");
            }
        }
    }
    public void removeGame(Game game){
        for (Game g : games) {
            if (g.getID() == game.getID() &&game.isAvailable()){
                games.remove(game);
                System.out.println("Game removed successfully.");
            }
            else {
                System.out.println("Game can't be deleted right now.It may be rented by someone or the game doesn't exist at all.");
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
        for (Movie m : movies) {
            if(movie.getID()== m.getID()  && m.isAvailable()){
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
            else if (!m.isAvailable()) {
                System.out.println("Movie is has already been rent by another costumer.");
                break;
            }
            else {
                System.out.println("Movie wasn't found.");
            }
        }
    }
    public void rentBook(Book book , Customer customer){
        for (Book b : books) {
            if (b.getID() == book.getID() && b.isAvailable()){
                String fullID = Integer.toString(book.getID()) + Integer.toString(customer.getID());
                int mainID = Integer.parseInt(fullID);
                Rental rental = new Rental(book , customer , mainID);
                Date now = new Date();
                rental.setRentalDate(now);
                customer.getRentals().add(rental);
                System.out.println("Book rented successfully!");
                System.out.println("Attention : You have 7 days from now to return this book or you will have to pay fine :) . ");
                book.setAvailable(false);
            } else if (!b.isAvailable()) {
                System.out.println("Movie is has already been rent by another costumer.");
                break;
            }
            else {
                System.out.println("Book wasn't found.");
            }
        }
    }
    public void rentGame(Game game , Customer customer){
        for (Game g : games) {
            if (g.getID() == game.getID() && g.isAvailable()){
                String fullID = Integer.toString(game.getID()) + Integer.toString(customer.getID());
                int mainID = Integer.parseInt(fullID);
                Rental rental = new Rental(game , customer , mainID);
                Date now = new Date();
                rental.setRentalDate(now);
                customer.getRentals().add(rental);
                System.out.println("Game rented successfully!");
                System.out.println("Attention : You have 7 days from now to return this game or you will have to pay fine :) . ");
                game.setAvailable(false);
            } else if (!g.isAvailable()) {
                System.out.println("Game is has already been rent by another costumer.");
                break;
            }
            else {
                System.out.println("Game wasn't found.");
            }
        }
    }

    public void returnMovie(Rental rental){
        int i = 0;
        for (Customer customer  : customers) {
            if (customer.getRentals().get(i).getID()== rental.getID()){
                customers.remove(customer);
                customer.getRentals().remove(i);
                rental.getMovie().setAvailable(true);
                System.out.println("Movie deleted successfully.");
                break;
            }
            i++;
        }
    }
    public void returnBook(Rental rental){
        int i = 0;
        for (Customer customer  : customers) {
            if (customer.getRentals().get(i).getID()== rental.getID()){
                customers.remove(customer);
                customer.getRentals().remove(i);
                rental.getMovie().setAvailable(true);
                System.out.println("Book deleted successfully.");
                break;
            }
            i++;
        }
    }
    public void returnGame(Rental rental){
        int i = 0;
        for (Customer customer  : customers) {
            if (customer.getRentals().get(i).getID()== rental.getID()){
                customers.remove(customer);
                customer.getRentals().remove(i);
                rental.getMovie().setAvailable(true);
                System.out.println("Game deleted successfully.");
                break;
            }
            i++;
        }
    }

    public static void rentItem(Item item, Customer customer) {
        String id = Integer.toString(item.getID()) + Integer.toString(customer.getID());
        int rentID = Integer.parseInt(id);
        if(item.isAvailable()){
            Rental rental = new Rental(item, customer,rentID);
            customer.addRent(rental);
            item.setAvailable(false);
            System.out.println("You have rented " + item.getTitle()+" successfully.");
        } else {
            System.out.println("This item is already rented by another customer");
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
