package Exc3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Manager extends Employee implements Sortable{
	public Manager (String n, double s, int d, int m, int y){
		super(n, s, d, m ,y);
		secretaryName = "";
	}
	
	public void raiseSalary(double byPercent){
		// add 1/2% bonus for every year of service
		GregorianCalendar todaysDate = new GregorianCalendar();
		int currentYear = todaysDate.get(Calendar.YEAR);
		double bonus = 0.5 * (currentYear - hireYear());
		super.raiseSalary(byPercent + bonus);
	}
	
	public String getSecretaryName(){
		return secretaryName;
	}
	
	private String secretaryName;
	
	/**
	 * Case 2: Imagine that we want to order the Managers in a similar way:
	 * class Managers extends Employee extends Sortable
	 * 
	 * Will it be work?
	 * No, because a subclass can only have one superclass.
	 * 
	 * What is your solution?
	 * Declare Sortable as an interface instead. Then implements it:
	 * class Managers extends Employee implements Sortable
	 * 
	 * With interfaces available, a class can implements interfaces as many
	 * as they want.
	 */
}
