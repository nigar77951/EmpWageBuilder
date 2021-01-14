public class EmpWageBuilder {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    // method for wage computation
    public static int computeEmpWage(String company, int empRatePerHr, int noOfWorkingDays, int maxHrsPermonth) {

        // Variables
        int empHrs = 0;
        int empWage = 0;
        int totalEmpWage = 0;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;

        // Computation
        while (totalEmpHrs <= maxHrsPermonth && totalWorkingDays < noOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

			 // Case Checking
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
                    break;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day: " + totalWorkingDays + "\tEmp Hr: " + empHrs);
        }
        totalEmpWage = totalEmpHrs * empRatePerHr;
        System.out.println("Total Employee Wage for company " + company + ": " + totalEmpWage + "\n");
        return totalEmpWage;
    }

	//main
    public static void main(String[] args) throws Exception {

        System.out.println("...Calc Emp wage for multiple companies...");
        computeEmpWage("Dmart", 20, 2, 10);
        computeEmpWage("Reliance", 10, 4, 20);
    }
}
