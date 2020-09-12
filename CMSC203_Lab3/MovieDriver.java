package lab3;

import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		
		boolean wantsMovie;
		
		do {
		//input movie information
		Movie movie1 = new Movie();
		System.out.println("Enter title of a movie: ");
		String title1 = myScanner.nextLine();
		movie1.setTitle(title1);
		System.out.println("Enter rating of the movie: ");
		String rating1 = myScanner.nextLine();
		movie1.setRating(rating1);
		System.out.println("Enter the number of tickets sold for this movie: ");
		int tickets1 = myScanner.nextInt();
		movie1.setSoldTickets(tickets1);
		System.out.println(movie1.toString());
		
		//ask if they want to input a new movie
		System.out.println("Do you want to enter another? (y or n)");
		myScanner.nextLine();
		wantsMovie = !myScanner.nextLine().equalsIgnoreCase("n");

		} while (wantsMovie == true);
		
		System.out.println("Goodbye");
		myScanner.close();
	}

}
