
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

	public static int ComputeWagesCompany(String company, int WageperHrs, int totalWorkingHrs,
											int WorkingDaysPerMonth) {
		// Variables
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingdays = 0;
		// Computation
		while (totalEmpHrs <= totalWorkingHrs && totalWorkingdays < WorkingDaysPerMonth) {
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
		int totalEmpWage = totalEmpHrs + WageperHrs;
		System.out.println("Total Emp Wage for Company: " + company + " is: " + totalEmpWage);
		return totalEmpWage;

	}

	public static void main(String[] args) {
		ComputeWagesCompany("TCS", 20, 100, 22);
		ComputeWagesCompany("Google", 28, 90, 21);
		ComputeWagesCompany("Microsoft", 25, 90, 21);
	}
}