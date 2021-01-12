
public class EmpWageBuilder {
    public static void main(String[] args) {

        System.out.println("...to Calculate Employee wage for full time if present...");

        // Initialization
        final int IS_FULL_TIME = 1;
        final int EMP_RATE_PER_HR = 20;

        int empHrs = 0;
        int empWage = 0;

        // random function
        double empCheck = Math.floor(Math.random() * 10) % 2;
        System.out.println(empCheck);

        // wage computation
        if (empCheck == IS_FULL_TIME) {
            System.out.println("Employee is Present.");
            empHrs = 8;
        } else {
            System.out.println("Employee is Absent.");
            empHrs = 0;
        }
        empWage = empHrs * EMP_RATE_PER_HR;
        System.out.println("Employee Wage : " + empWage);
    }
}
