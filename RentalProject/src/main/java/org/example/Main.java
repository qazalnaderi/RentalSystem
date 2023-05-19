package org.example;
import java.awt.print.Book;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The Secret Garden", "Fiction","2022-03-15", 1 , "Alice Thompson","Penguin Books" );
        Book book2 = new Book("The Alchemist" , "Fantasy","2021-07-01",2,"Benjamin Martin","HarperCollins");
        Book book3 = new Book("Pride and Prejudice","Romance", "1813-01-28" , 3 ,"Jane Austen" , "Thomas Egerton" );
        Book book4 = new Book("To Kill a Mockingbird","Classic","1960-07-11",4, "Harper Lee", "J. B. Lippincott & Co.");
        Book book5 = new Book("1984","Dystopian","1949-06-08","George Orwell",5,"Secker & Warburg");
        Book book6 = new Book("The Great Gatsby","Fiction","1925-04-10",6,"F. Scott Fitzgerald","Charles Scribner's Sons");
        Book book7 = new Book( "Harry Potter and the Philosopher's Stone","Fantasy","1997-06-26",7,"J.K. Rowling","Bloomsbury Publishing");
        Book book8 = new Book("The Hobbit","Fantasy","1937-09-21",8,"J.R.R. Tolkien","George Allen & Unwin");
        Book book9 = new Book("The Catcher in the Rye","Coming-of-age","1951-07-16",9,"J.D. Salinger","Little, Brown and Company");
        Book book10 = new Book("The Chronicles of Narnia: The Lion, the Witch, and the Wardrobe","Fantasy","1950-10-16",10,"C.S. Lewis","Geoffrey Bles",);

        Game game1 = new Game( 1,"The Legend of Zelda: Breath of the Wild","Action-Adventure","2017-03-03","Shigeru Miyamoto","Nintendo");
        Game game2 = new Game(2,"Red Dead Redemption 2","Action-Adventure","2018-10-26","Dan Houser","Rockstar Games");
        Game game3 = new Game(3,"The Witcher 3: Wild Hunt","Action-RPG","2015-05-19","Konrad Tomaszkiewicz","CD Projekt");
        Game game4 = new Game(4,"Super Mario Odyssey","Platformer","2017-10-27","Kenta Motokura","Nintendo");
        Game game5 = new Game(5,"God of War (2018)","Action-Adventure","2018-04-20","Cory Barlog","Santa Monica Studio");
        Game game6 = new Game( 6,"Grand Theft Auto V","Action-Adventure","2013-09-17","Aaron Garbut","Rockstar Games");
        Game game7 = new Game( 7,"Minecraft","Sandbox","2011-11-18","Markus Persson","Mojang Studios");
        Game game8 = new Game(8,"The Last of Us Part II","Action-Adventure","2020-06-19","Neil Druckmann","Naughty Dog");
        Game game9 = new Game(9,"Fallout 4","Action-RPG","2015-11-10","Todd Howard","Bethesda Game Studios");
        Game game10 = new Game(10,"Assassin's Creed Valhalla","Action-Adventure","2020-11-10","Ashraf Ismail","Ubisoft Montreal");

        Movie movie1 = new Movie("Inception","Sci-Fi","2010-07-16",1,"Leonardo DiCaprio, Joseph Gordon-Levitt","Christopher Nolan");
        Movie movie2 = new Movie("The Shawshank Redemption","Drama","1994-09-23",2,"Tim Robbins, Morgan Freeman","Frank Darabont");
        Movie movie3 = new Movie("The Dark Knight","Action","2008-07-18",3,"Christian Bale, Heath Ledger","Christopher Nolan");
        Movie movie4 = new Movie("Pulp Fiction","Crime","1994-10-14",4,"John Travolta, Uma Thurman","Quentin Tarantino");
        Movie movie5 = new Movie("The Godfather","Crime","1972-03-24",5,"Marlon Brando, Al Pacino","Francis Ford Coppola");
        Movie movie6 = new Movie("Fight Club","Drama","1999-10-15",6,"Brad Pitt, Edward Norton","David Fincher");
        Movie movie7 = new Movie( "The Matrix","Sci-Fi","1999-03-31", 7,"Keanu Reeves, Laurence Fishburne","Lana Wachowski, Lilly Wachowski");
        Movie movie8 = new Movie("Forrest Gump","Drama","1994-07-06",8,"Tom Hanks, Robin Wright","Robert Zemeckis");
        Movie movie9 = new Movie("The Lord of the Rings: The Fellowship of the Ring","Fantasy","2001-12-19",9,"Elijah Wood, Ian McKellen","Peter Jackson");
        Movie movie10 = new Movie("The Avengers","Action","2012-04-11",10, "Robert Downey Jr., Chris Evans","Joss Whedon");

        Costumer costumer1 = new Costumer(1,"John Smith","johnsmith@example.com","1234567890","123 Main Street");
        Costumer costumer2 = new Costumer(2,"Emily Johnson","emilyjohnson@example.com","9876543210","456 Oak Avenue");
        Costumer costumer3 = new Costumer(3,"Michael Brown","michaelbrown@example.com","5555555555","789 Elm Street");
    }
}