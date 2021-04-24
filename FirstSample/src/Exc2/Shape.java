package Exc2;

public class Shape {
	// private instance variabel, not accessible from outside this class
	private String color = "red";
	private boolean filled = true;
	
	public Shape(){		// Constructor with default values
		color = "green";
		filled = true;
	}
	
	public Shape(String color, boolean filled){	// Constructor with given values
		this.color = color;
		this.filled = filled;
	}
	
	// Returns the value of color
	public String getColor(){
		return color;
	}
	
	// Returns the value of filled
	public boolean isFilled(){
		return filled;
	}
	
	// Setting the value of color by the given value
	public void setColor(String color){
		this.color = color;
	}
	
	// Setting the value of filled by the give value
	public void setFilled(boolean filled){
		this.filled = filled;
	}
	
	public String toString(){
		return "Shape[color=" + color + ",filled=" + filled +"]";
	}
}
