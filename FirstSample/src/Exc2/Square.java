package Exc2;

public class Square extends Rectangle {
	
	// Constructor with given side value
	public Square(double side){
		super(side, side);
	}
	
	// Constructor with given side, color, and filled value
	public Square(double side, String color, boolean filled){
		super(side, side, color, filled);
	}
	
	// Returns the value of side
	public double getSide(){
		return super.getLength();
	}
	
	// Setting the value of side by the given value
	public void setSide(double side){
		setLength(side);
		super.setWidth(side);
	}
	
	@Override
	public void setLength(double side){
		super.setLength(side);
	}
	
	@Override
	public void setWidth(double side){
		super.setWidth(side);
	}
	
	@Override
	public String toString(){
		return "Square[" + super.toString() + "]";
	}
	
	/**
	 * No need to override the getArea() and getPerimeter() methods from
	 * superclass Rectangle, because the value of the width and length are
	 * already set to be equal because it is a square
	 */
}
