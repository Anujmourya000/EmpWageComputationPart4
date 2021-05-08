
/**
 * @description Class for defining the Employee Wages Computation
 * @param None
 * 
 */
public class EmpWageComputationPart4 {
	private static final int IS_PRESENT = 1;

	// Taking values randomly
	public static double empCheck = Math.floor(Math.random() * 10) % 2;

	public static void main(String[] args) {

		if (empCheck == IS_PRESENT) {
			System.out.println("Employee is present");
		}
		else
			System.out.println("Employee is absent");
	}
}
