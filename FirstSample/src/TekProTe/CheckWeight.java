package TekProTe;
import java.util.*;


public class CheckWeight {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		IdealWeight w = new IdealWeight();
		System.out.println("What is your gender? (Male = 1, Female = 2) = ");
		int gender = in.nextInt();
		System.out.println("Your Height (cm) = ");
		double height = in.nextFloat();
		double ideal = w.calculate(height, gender);
				
		System.out.printf("\nYour ideal weight is around %.2f kg",ideal);
	}

}
