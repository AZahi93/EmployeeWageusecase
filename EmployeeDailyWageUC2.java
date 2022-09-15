package day4;

public class EmployeeDailyWageUC2 {

	public static void main(String[] args) {
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HOUR = 20;
		int empHRS = 0;
		int empWage = 0;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME)
			empHRS = 8;
		else
			empHRS = 0;
		empWage = empHRS * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: " + empWage);
	}
}
