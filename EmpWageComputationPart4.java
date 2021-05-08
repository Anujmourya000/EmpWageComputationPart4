
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
	private static final int IS_ABSENT = 0;
	private static final int IS_PRESENT = 1;
	private int WAGE_PER_HOUR = 20;
	private int FULL_DAY_HOUR = 8;
	private int HALF_DAY_HOUR = 4;
	private static int TOTAL_WORKING_HOURS = 100;
	private static int WORKING_DAYS_PER_MONTH = 20;

	// Constructor
	public EmpWageComputationPart4(int WAGE_PER_HOUR, int FULL_DAY_HOUR, int HALF_DAY_HOUR,
									int WORKING_DAYS_PER_MONTH) {
		this.WAGE_PER_HOUR = WAGE_PER_HOUR;
		this.FULL_DAY_HOUR = FULL_DAY_HOUR;
		this.HALF_DAY_HOUR = HALF_DAY_HOUR;
		this.WORKING_DAYS_PER_MONTH = WORKING_DAYS_PER_MONTH;
	}

	/**
	 * @description creating method for calculating wages
	 * @param None
	 * 
	 */
	public static void CalculatingWages() {
		int emphrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;

		while (totalEmpHrs <= TOTAL_WORKING_HOURS && totalWorkingDays <= WORKING_DAYS_PER_MONTH) {
			totalWorkingDays++;
			totalEmpHrs = totalEmpHrs + 8;
			Integer empCheck = (int) Math.floor(Math.random() * 10) % 2;

			switch (empCheck) {
			case IS_PRESENT:
				EmpWageComputationPart4 empWage1 = new EmpWageComputationPart4(20, 8, 0, 20);
				EmpWageComputationPart4 empWage2 = new EmpWageComputationPart4(20, 0, 4, 20);
				int WagesofFulltime = (empWage1.WAGE_PER_HOUR * totalEmpHrs * totalWorkingDays);
				int WagesofParttime = (empWage2.WAGE_PER_HOUR * (totalEmpHrs / 2) * totalWorkingDays);
				System.out.println("Full time Employee monthly wages is: " + WagesofFulltime);
				System.out.println("Part time Employee monthly wages is: " + WagesofParttime);
				break;

			case IS_ABSENT:
				System.out.println("Employee is absent");
			}
		}

	}

	public static void main(String[] args) {
		CalculatingWages();

	}
}
