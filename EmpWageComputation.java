package day8;

public class EmpWageComputation {
	// Initialising attributes
	public static final int IsFulltime = 0;
	public static final int Isparttime = 1;
	public static final int Wage_per_hr = 20;
	public static final int MaxHrs = 100;
	public static final int No_of_working_days = 20;

	// Method for Calculating EmpWage
	public static void employeeWage() {
		int empHrs = 0;
		int totalWorkingDays = 0;
		int workingHr = 0;
		int empWage = 0;

		while (empHrs <= MaxHrs && totalWorkingDays <= No_of_working_days) {
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case 0: {
				workingHr = 8;
				break;
			}
			case 1: {
				workingHr = 4;
				break;
			}
			case 2: {
				workingHr = 0;
				break;
			}
			}
			empHrs += workingHr;

			empWage = empWage + (workingHr * Wage_per_hr);
			totalWorkingDays++;
		}
		System.out.println(empWage);

	}

	public static void main(String[] args) {

		employeeWage();
	}

}
