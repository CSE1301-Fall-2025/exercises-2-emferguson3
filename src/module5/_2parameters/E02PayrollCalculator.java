package module5._2parameters;

/*
 * Exercise: Create a calculatePay method and use it to replace
 * the redundant code within the main method.
 */
public class E02PayrollCalculator {

	//add a new static method calculatePay here



	public static void main(String[] args) {
		  calculatePay("Fred",12.5,20);
		  calculatePay("Amir",15.0,35);
	}
	public static void calculatePay(String employee, double hourlyRate, double hoursWorked) {
		double weeklyPay = hourlyRate * hoursWorked;
		System.out.println(employee  + ":" + weeklyPay);
	}
}

