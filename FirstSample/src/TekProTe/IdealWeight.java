package TekProTe;

public class IdealWeight {
	private double idealkg;
	double calculate(double cm, int gend){
		idealkg = 0;
		if(gend == 1){
		idealkg = (cm - 100) - ((cm - 100)*0.1);
		} else {
		if(gend == 2){
		idealkg = (cm - 100) - ((cm - 100)*0.15);
			}
		}
		return idealkg;
	}
}
