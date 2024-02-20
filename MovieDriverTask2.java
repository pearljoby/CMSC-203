 /*Class: CMSC203 
 Program: Lab 1
 Instructor: Ahmed Tarek
 Due Date: 02/19/24
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
 Name: Pearl Joby

*/

import java.util.Scanner;

public class MovieDriverTask2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueInputMovies = true;

        while (continueInputMovies) {
            Movie movie = new Movie();

            System.out.print("Enter the title of the movie: ");
            String title = sc.nextLine();
            movie.setTitle(title);

            System.out.print("Enter the rating of the movie: ");
            String rating = sc.nextLine();
            movie.setRating(rating);

            System.out.print("Enter the number of tickets sold: ");
            int ticketsSold = sc.nextInt();
            // Consume the remaining newline character
            sc.nextLine();
            movie.setSoldTickets(ticketsSold);

            System.out.println("Movie Information:");
            System.out.println(movie.toString());

            System.out.print("Do you want to continue entering movies? (yes/no): ");
            String userResponse = sc.nextLine().toLowerCase();

            // Check if the user wants to continue
            if (!userResponse.equals("yes")) {
                continueInputMovies = false;
                System.out.println("GoodBye");
            }
        }

        // Close the scanner
        sc.close();
    }
}