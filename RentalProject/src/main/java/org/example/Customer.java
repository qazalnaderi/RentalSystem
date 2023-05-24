package org.example;
import java.util.ArrayList;

public class Customer {
    private int ID;
    private String name;
    private String email;
    private String phone;
    private String address;
    private ArrayList <Rental>  rentals;

    public Customer(int ID , String name , String email , String phone , String address ) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.rentals = new ArrayList<>();
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<Rental> getRentals() {
        return rentals;
    }


    public void addRent(Rental rental) {
        if(rentals== null){
            rentals = new ArrayList<>();
        }
        rentals.add(rental);
        System.out.println("You rented an item successfully.");
    }
}
