package day8;

public class EmpWageComputation {

	public static final int isFulltime = 0;
	public static final int isparttime = 1;
	public static final int wage_per_hr = 20;
	public static final int maxHrs = 100;
	public static final int No_of_working_days = 20;

	public static void main(String[] args) {

		int empHrs = 0;
		int totalWorkingDays = 0;
		int workingHr = 0;
		int empWage = 0;
		employeeWage(empHrs, totalWorkingDays, workingHr, empWage);
	}

	public static void employeeWage(int empHrs, int totalWorkingDays, int workingHr, int empWage) {

		while (empHrs <= maxHrs && totalWorkingDays <= No_of_working_days) {
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

			empWage = empWage + (workingHr * wage_per_hr);
			totalWorkingDays++;
		}
		System.out.println(empWage);

	}

}
