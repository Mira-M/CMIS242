
public class SimpleGeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	// Construct a default geometric object
	public SimpleGeometricObject() {
		dateCreated = new java.util.Date();
	}// End SimpleGeometricObject
	
	//Construct a geometric object with the specified color and filled value
	public SimpleGeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}// End Overloaded Constructor
	
	//Return color
	public String getColor() {
		return color;
	}// End getColor

	// Set a new color
	public void setColor(String color) {
		this.color = color;
	}// End setColor
	
	// Return filled. since filled is boolean its get method is named isFilled
	public boolean isFilled() {
		return filled;
	}// end isFilled
	
	//Set a new filled
	public void setFilled(boolean filled) {
		this.filled = filled;
	}// end setFilled
	
	// Get dateCreated
	public java.util.Date getDateCreated() {
		return dateCreated;
	}// end getDateCreated
	
	//Return a string representation of this object
	public String toString() {
		return "created on" + dateCreated + "\ncolor: " + color +
				" and filled: " + filled;
	}// end toString
	
}// End Class SimpleGeometricObject
