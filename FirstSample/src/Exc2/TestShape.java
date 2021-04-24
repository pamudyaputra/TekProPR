package Exc2;

public class TestShape {
	public static void main(String[] args){
		Shape s = new Shape();
		System.out.println(s.getColor());
		System.out.println(s.isFilled());
		s.setColor("champagne");
		s.setFilled(false);
		System.out.println(s.toString());
		
		Shape s2 = new Shape("champagne", false);
		System.out.println(s2.getColor());
		System.out.println(s2.isFilled());
		s2.setColor("violet");
		s2.setFilled(true);
		System.out.println(s2.toString());
		
		Square sq = new Square(2, "green", true);
		System.out.println("Square area = " + sq.getArea());
		System.out.println("Square perimeter = " + sq.getPerimeter());
		System.out.println(sq.toString());
	}
}
