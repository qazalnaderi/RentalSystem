package org.example;
import java.util.Date;
public class Rental {
    private Item item;
    private Movie movie;
    private Game game;
    private Book book;
    private int ID;
    private Customer customer;
    private Date rentalDate;
    private Date returnDate  ;

    public Rental(Item item , Customer customer , int ID){
        this.item = item;
        this.customer = new Customer(customer.getID() , customer.getName(),customer.getEmail(), customer.getPhone(), customer.getAddress() );
        this.ID = ID;
        this.rentalDate = new Date();
    }


    public int getID() {
        return ID;
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
    public double calculateLateFee() {
        System.out.println("You're a bit late! Now you have to pay 1.4$ per day.");
        long distance = (returnDate.getTime() - rentalDate.getTime()) ;
        double fine = distance*1.4;
        System.out.println("The amount of fine is: "+fine);
        return  fine;
    }
}
