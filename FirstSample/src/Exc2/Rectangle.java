package Exc2;

public class Rectangle extends Shape {
	private double width;
	private double length;
	
	// A constructor with no args
	public Rectangle(){
		super();
		width = 1.0;
		length = 1.0;
	}
	
	// A constructor with given width and length
	public Rectangle(double width, double length){
		super();
		this.width = width;
		this.length = length;
	}
	
	// A constructor with given width, length, color, and filled value
	public Rectangle(double width, double length, String color, boolean filled){
		super(color,filled);
		this.width = width;
		this.length = length;
	}
	
	// Returns the value of width
	public double getWidth(){
		return width;
	}
	
	// Returns the value of length
	public double getLength(){
		return length;
	}
	
	// Setting the value of width by the given value
	public void setWidth(double width){
		this.width = width;
	}
	
	// Setting the value of length by the given value
	public void setLength(double length){
		this.length = length;
	}
	
	// Computing the area of the rectangle
	// Returns the computed area
	public double getArea(){
		return length*width;
	}
	
	// Computing the perimeter of the rectangle
	// Returns the computer perimeter
	public double getPerimeter(){
		return (2*length) + (2*width);
	}
	
	@Override
	public String toString(){
		return "Rectangle[" + super.toString() + 
				",width=" + width +
				",length=" + length + "]";
	}
}
