// Dice class that maintains two Die objects
package assignment2;

public class Dice {
	private Die D0, D1;
	
	// no argument constructor that initializes all Die objects
	public Dice () {
		D0 = new Die();
		D1 = new Die();
	}
	
	// returns the sum of all Die face values
	public int getFaceValue () {
		return D0.getFaceValue() + D1.getFaceValue();
	}
	
	// rolls all Die
	public void roll () {
		D0.roll();
		D1.roll();
	}
}
