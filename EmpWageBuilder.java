public class EmpWageBuilder {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static final int MAX_HRS_IN_MONTH = 100;

    public static void main(String[] args) throws Exception {

    	System.out.println("...to Calculate Employee wage for full time or part time based on no. of working days and hours if present...");

        // Initialization
        int empHrs = 0;
        int totalEmpWage = 0;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;

        // random function
        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            // wage computation
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
        totalEmpWage = totalEmpHrs * EMP_RATE_PER_HR;
        System.out.println("Total Employee Wage: " + totalEmpWage);
    }
}
