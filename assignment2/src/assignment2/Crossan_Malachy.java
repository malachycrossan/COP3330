/* Author: Malachy Crossan
 * PID: ma378458
 * NID: 5522964
 * Date: 10/7/24
 * Assignment2
 * Rolls Dice 1000 times
 * Tallies up occurrences
 * prints histogram
*/
package assignment2;

public class Crossan_Malachy {
	
	// tester method
	public static void main (String args[]) {
		Dice D6 = new Dice(); // Initializes a set of Dice
		int[] frequency = {0,0,0,0,0,0,0,0,0,0,0}; // Creates a frequency table with where the index is the value - 2
		
		// rolls the D6 object 1000 times and tallies the value of the roll
		for (int i = 0; i < 1000; i++) {
			D6.roll();
			frequency[D6.getFaceValue()-2]++;
		}
		
		// This next section prints the frequency table in the format of a histogram
		System.out.println("Dice sum frequency for 1000 rolls:");
		System.out.println("  |0   25   50   75   100  125  150  175"); // the values are spaced so that the histogram lines up correctly
		for (int i = 2; i <= 12; i++) { // loops through 11 possible outcomes
			System.out.print(i/10 < 1 ? " " + i : i); // ternary operation that maintains a two character wide format for x-labels
			System.out.print("|");
			for (int f = frequency[i-2]; f > 0; f -= 5) System.out.print("x"); // prints one x per 5 occurrences 
			System.out.println("|" + frequency[i-2]); // prints a label with the actual frequency at the end
		}
	}
}
