public class EmpWageBuilder {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static final int MAX_HRS_IN_MONTH = 100;

	public static int calcEmpWageForCompany(String company, int empRate, int numOfDays, int maxHrs) {
		   // Initialization
        int empHrs = 0;
        int totalEmpWage = 0;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;

        // random function
        while (totalEmpHrs <= maxHrs && totalWorkingDays < numOfDays) {
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
        totalEmpWage = totalEmpHrs * empRate;
        System.out.println("Total Employee Wage for a company: " +company+" is: "+ totalEmpWage);
		return totalEmpWage;
	}
	public static void main(String[] args) {
		calcEmpWageForCompany("Microsoft", 20, 2, 10);
		calcEmpWageForCompany("Amazon", 30, 3, 10);

	}
}
