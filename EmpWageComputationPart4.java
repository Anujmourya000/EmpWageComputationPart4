
/**
 * @description Class for defining the Employee Wages Computation
 * @param None
 * 
 */
public class EmpWageComputationPart4 {
	/**
	 * @description defining Global Variables
	 * @param None
	 * 
	 */
	private static final int EMP_PART_TIME = 1;
	private static final int EMP_FULL_TIME = 2;
	private static int WAGE_PER_HOUR = 20;
	private static int TOTAL_WORKING_HOURS = 100;
	private static int WORKING_DAYS_PER_MONTH = 20;

	public static int ComputeWages() {
		// Variables
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingdays = 0;
		// Computation
		while (totalEmpHrs <= TOTAL_WORKING_HOURS && totalWorkingdays <= WORKING_DAYS_PER_MONTH) {
			totalWorkingdays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case EMP_FULL_TIME:
				empHrs = 8;
				break;

			case EMP_PART_TIME:
				empHrs = 4;
				break;

			default:
				empHrs = 0;
			}
			totalEmpHrs = totalEmpHrs + empHrs;
			System.out.println("DAY#: " + totalWorkingdays + " & EmpHr:" + empHrs);
		}
		int totalEmpWage = totalEmpHrs + WAGE_PER_HOUR;
		System.out.println("Total Emp Wage: " + totalEmpWage);
		return totalEmpWage;

	}

	public static void main(String[] args) {
		ComputeWages();
	}
}
