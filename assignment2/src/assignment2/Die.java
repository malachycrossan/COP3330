// Die class with FACES number of faces
package assignment2;

public class Die {
	private int FACES = 6;
	private int faceValue;
	
	// no argument constructor that initializes faceValue to 1
	public Die() {
		faceValue = 1;
	}
	
	// method that returns the current faceValue
	public int getFaceValue() {
		return faceValue;
	}
	
	// method that sets the current faceValue to value
	public void setFaceValue(int value) {
		faceValue = value;
	}
	
	// method that assigns faceValue a random integer [1,FACES]
	public void roll() {
		faceValue = 1 + (int)(Math.random()*FACES);
	}
}
