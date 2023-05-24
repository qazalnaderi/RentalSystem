package org.example;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hi");
        Gson gson = new Gson(); // create a new Gson object
        Reader reader = new FileReader("C:\\Users\\HP\\RentalSystem\\RentalProject\\src\\test\\TestYourFork.json"); // open the input file
        AllModules allMoudulesList = gson.fromJson(reader , new TypeToken<AllModules>() {
        }.getType());

        Customer Joshn = allMoudulesList.getCustomers().get(0);
        Customer Emily = allMoudulesList.getCustomers().get(1);
        Customer Brown = allMoudulesList.getCustomers().get(2);
        for (Item tempItem : allMoudulesList.getBooks()) {
            if (tempItem.getID() == 3) {
                RentalStore.rentItem(tempItem, Joshn);
            } else if (tempItem.getID() == 6) {
                RentalStore.rentItem(tempItem, Joshn);
            }
        }
        for (Item tempItem : allMoudulesList.getBooks()) {
            if (tempItem.getID() == 1) {
                RentalStore.rentItem(tempItem, Emily);
            } else if (tempItem.getID() == 7) {
                RentalStore.rentItem(tempItem, Emily);
            }
        }
        for (Item tempItem : allMoudulesList.getBooks()) {
            if (tempItem.getID() == 9) {
                RentalStore.rentItem(tempItem, Brown);
            } else if (tempItem.getID() == 4) {
                RentalStore.rentItem(tempItem, Brown);
            }
        }

        reader.close();          // close the input file
        //write in json
        Gson writing = new Gson();
        String json = writing.toJson(allMoudulesList);
        String filepath = "C:\\Users\\HP\\RentalSystem\\RentalProject\\src\\test\\TestYourFork.json";
        try {
            FileWriter writer = new FileWriter(filepath);
            writer.write(json);
            writer.close();
            System.out.println("JSON Data has been updated.");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        }
}