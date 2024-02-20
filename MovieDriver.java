 /*Class: CMSC203 
 Program: Lab 1
 Instructor: Ahmed Tarek
 Due Date: 02/19/24
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
 Name: Pearl Joby

*/
import java.util.Scanner;

public class MovieDriver {
    public static void main(String[] args) {
        // Create a new object of type Scanner
        Scanner sc = new Scanner(System.in);
      
        // new movie object
        Movie movie = new Movie();

        //title of a movie
        System.out.print("Enter the title of the movie: ");
        
        // input user answer
        String title = sc.nextLine();
        
        // Set the title
        movie.setTitle(title);

        //enter the movie’s rating
        System.out.print("Enter the rating of the movie: ");
        
        // input rating
        String rating = sc.nextLine();
        
        // Set the rating 
        movie.setRating(rating);

        // number of tickets sold
        System.out.print("Enter the number of tickets sold: ");
        
        //input numbers
        int ticketsSold = sc.nextInt();
        
        // Consume the remaining newline character
        sc.nextLine();
        
        // Set the number of tickets sold in the movie object
        movie.setSoldTickets(ticketsSold);

        // Print out the information using the movie’s toString method
        System.out.println("Movie Information:");
        System.out.println(movie.toString());

        // Close the scanner
        sc.close();
    }
}