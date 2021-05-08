
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
	private static final int IS_PRESENT = 1;
	private int WAGE_PER_HOUR = 20;
	private int FULL_DAY_HOUR = 8;
	private int HALF_DAY_HOUR = 4;

	public static double empCheck = (int) Math.floor(Math.random() * 10) % 2;

	// Constructor
	public EmpWageComputationPart4(int WAGE_PER_HOUR, int FULL_DAY_HOUR, int HALF_DAY_HOUR) {
		this.WAGE_PER_HOUR = WAGE_PER_HOUR;
		this.FULL_DAY_HOUR = FULL_DAY_HOUR;
		this.HALF_DAY_HOUR = HALF_DAY_HOUR;
	}

	public static void main(String[] args) {

		if (empCheck == IS_PRESENT) {
			EmpWageComputationPart4 empWage1 = new EmpWageComputationPart4(20, 8, 0);
			EmpWageComputationPart4 empWage2 = new EmpWageComputationPart4(20, 0, 4);
			int dailyWagesofFulltime = (empWage1.WAGE_PER_HOUR * empWage1.FULL_DAY_HOUR);
			int dailyWagesofParttime = (empWage2.WAGE_PER_HOUR * empWage2.HALF_DAY_HOUR);
			System.out.println("Full time Employee daily wages is: " + dailyWagesofFulltime);
			System.out.println("Part time Employee daily wages is: " + dailyWagesofParttime);
		} else {
			System.out.println("Employee is absent");
		}
	}
}
