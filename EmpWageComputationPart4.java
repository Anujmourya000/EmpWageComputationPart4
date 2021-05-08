
/**
 * @description Class for defining the Employee Wages Computation
 * @param None
 * 
 */
public class EmpWageComputationPart4 {
	/**
	 * @description Declaring Global variables as private
	 * @param None
	 * 
	 */
	private static final int EMP_PART_TIME = 1;
	private static final int EMP_FULL_TIME = 2;

	private static String company;
	private static int WagePerHrs;
	private static int TotalWorkingHrs;
	private static int WorkingDaysPerMonth;
	private static int totalEmpWage;

	/**
	 * @description Constructor of Employee wage computation Class
	 * @param None
	 * 
	 */
	public EmpWageComputationPart4(String company, int WagePerHrs, int TotalWorkingHrs, int WorkingDaysPerMonth) {
		this.company = company;
		this.WagePerHrs = WagePerHrs;
		this.TotalWorkingHrs = TotalWorkingHrs;
		this.WorkingDaysPerMonth = WorkingDaysPerMonth;
	}

	/**
	 * @description Created method for computation of employee wages for all
	 *              companies
	 * @param None
	 * 
	 */
	public void ComputeWagesCompany() {
		// Variables
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingdays = 0;
		// Computation
		while (totalEmpHrs <= TotalWorkingHrs && totalWorkingdays < WorkingDaysPerMonth) {
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
		totalEmpWage = totalEmpHrs * WagePerHrs;
	}

	@Override
	public String toString() {
		return "Total Employee Wage for Company: " + company + " is " + totalEmpWage;
	}

	public static void main(String[] args) {

		EmpWageComputationPart4 tcs = new EmpWageComputationPart4("TCS", 20, 100, 22);
		tcs.ComputeWagesCompany();
		System.out.println(tcs);
		EmpWageComputationPart4 google = new EmpWageComputationPart4("Google", 28, 90, 21);
		google.ComputeWagesCompany();
		System.out.println(google);
		EmpWageComputationPart4 microsoft = new EmpWageComputationPart4("Microsoft", 25, 90, 21);
		microsoft.ComputeWagesCompany();
		System.out.println(microsoft);

	}
}
