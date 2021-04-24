package Exc1;

public class Cylinder extends Circle{ // Save as "Cylinder.java"
	private double height; //private variable
	
	// Constructor with default color, radius and height
	public Cylinder(){
		super(); // call superclass no-arg constructor Circle()
		height = 1.0;
	}
	
	// Constructor with default radius, color but given height
	public Cylinder(double height){
		super();
		this.height = height;
	}
	
	// Constructor with default color, but gicen radius, height
	public Cylinder(double radius, double height){
		super(radius);
		this.height = height;
	}
	
	// A public method for retrieving the height
	public double getHeight(){
		return height;
	}
	
	// A public method for computing the volume of cylinder
	// use superclass method getArea() to get the base area
	public double getVolume(){
		return super.getArea()*height;
	}
	
	@Override 
	// A public method for computing the surface area of cylinder
	public double getArea(){
		return 2*Math.PI*super.getRadius()*height + 2*super.getArea();
	}
	
	@Override
	public String toString(){	// in Cylinder class
		return "Cylinder : subclass of " + super.toString() // use Circle's toString()
		+ " height=" + height;
	}

}
