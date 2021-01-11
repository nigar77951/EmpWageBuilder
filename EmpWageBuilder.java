public class EmpWageBuilder {
	public static void main(String[] args) {

	    System.out.println("...To check Employee Attendance...");

	    // Initialization
	    final int IS_FULL_TIME = 1;

	    // random function
	    double empCheck = Math.floor(Math.random() * 10) % 2;
	    System.out.println(empCheck);

	    // wage computation
	    if (empCheck == IS_FULL_TIME) {
	        System.out.println("Employee is Present.");
	    } else {
	        System.out.println("Employee is Absent.");
	    }
		}
}


