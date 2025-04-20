/**
 * Author: Taylor Ericson
 * Class: CSC-240 Computer Science II (Java)
 * Description: A class that calculates the fewest number of each bill
 * and coin needed to represent an amount entered by the user.
 */

public class ChangeCalculator {

	private int tens, fives, ones, quarters, dimes, nickels, pennies;
	
	// Constructor taking in a double representing a monetary value
	public ChangeCalculator(double amount) {
		// Convert amount to total amount in cents
		int total = (int)Math.round(amount * 100); 
		
		// Calculate number of ten dollar bills ($10 = 1000 cents)
		tens = total / 1000;
		total %= 1000;  // Calculate remainder
		
		// Calculate number of five dollar bills ($5 = 500 cents)
		fives = total / 500;
		total %= 500;  // Calculate remainder
		
		// Calculate number of one dollar bills ($1 = 100 cents)
		ones = total / 100;
		total %= 100;  // Calculate remainder
		
		// Calculate number of quarters
		quarters = total / 25;
		total %= 25;  // Calculate remainder
		
		// Calculate number of dimes
		dimes = total / 10;
		total %= 10;  // Calculate remainder
		
		// Calculate number of nickels
		nickels = total / 5;
		total %= 5; // Calculate remainder
		
		// Remainder is the number of pennies
		pennies = total;
	}
	
	// A formatted string that prints out the fewest number of each bill and coin needed.
	@Override
	public String toString() {
		return "\n----------------\n" +
				tens + " ten dollar bills\n" +
				fives + " five dollar bills\n" +
				ones + " one dollar bills\n" +
				quarters + " quarters\n" +
				dimes + " dimes\n" +
				nickels + " nickels\n" +
				pennies + " pennies\n" +
				"----------------\n";
	}
}
