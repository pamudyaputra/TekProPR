package Exc2;

public class Circle extends Shape{
	private double radius;
	
	// A constructor with no args
	public Circle(){	
		super();
		radius = 1.0;
	}
	
	// A constructor with given radius
	public Circle(double radius){
		super();
		this.radius = radius;
	}
	
	// A constructor with given color, filled status, and radius
	public Circle(double radius, String color, boolean filled){
		super(color, filled);
		this.radius = radius;
	}
	
	// Returns the value of radius
	public double getRadius(){
		return radius;
	}
	
	// Setting the value of radius by the given value
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	// Computing the area of the circle
	// Returns the computed area
	public double getArea(){
		return Math.PI*radius*radius;
	}
	
	// Computing the perimeter of the circle
	// Returns the computed perimeter
	public double getPerimeter(){
		return 2*Math.PI*radius;
	}
	
	@Override
	public String toString(){
		return "Circle[" + super.toString() + ",radius=" + radius +"]";
	}
}
