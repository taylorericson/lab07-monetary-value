/**
 * Author: Taylor Ericson
 * Class: CSC-240 Computer Science II (Java)
 * Description: A Driver class that prompts the user for a monetary amount
 * that will be used to calculate the fewest number of bills and coins needed.
 */

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String input;
		
		while (true) {
			// Prompt user for input
            System.out.print("Enter a monetary amount or type 'quit': ");
            input = scanner.nextLine().trim();
            
            // Check for exit condition
            if (input.equalsIgnoreCase("quit")) {
            	System.out.println("Exiting program...");
                break;
            }

            try {
            	// Try to parse input as a double
                double amount = Double.parseDouble(input);
                
                // Check for negative input
                if (amount < 0) {
                    System.out.println("Amount must be positive.");
                    continue;
                }
                
                // Create new ChangeCalculator object and calculate change
                ChangeCalculator change = new ChangeCalculator(amount);
                System.out.println(change.toString());
                
            } catch (NumberFormatException e) {
            	// Handle invalid input
                System.out.println("EXCEPTION: Invalid input");
            }
        }
		
		System.out.println("Goodbye!");

	}
} 
