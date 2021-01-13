public class EmpWageBuilder {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    // Variables
    private final String company;
    private final int empRatePerHr;
    private final int noOfWorkingDays;
    private final int maxHrsPeronth;

    // Constructor of mtd EmpWageBuilder
    public EmpWageBuilder(String company, int empRatePerHr, int noOfWorkingDays, int maxHrsPeronth) {
        this.company = company;
        this.empRatePerHr = empRatePerHr;
        this.noOfWorkingDays = noOfWorkingDays;
        this.maxHrsPeronth = maxHrsPeronth;
    }

    // method to compute wage
    public void computeEmpWage() {

        // Variables
        int empHrs = 0;
        int totalEmpWage = 0;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;

        // Computation
        while (totalEmpHrs <= maxHrsPeronth && totalWorkingDays < noOfWorkingDays) {
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
	}

    public static void main(String[] args) throws Exception {

    	System.out.println("...save wage for multiple companies...");

        // creating objects for companies
        EmpWageBuilder dMart = new EmpWageBuilder("Dmart", 20, 2, 10);
        EmpWageBuilder reliance = new EmpWageBuilder("Reliance", 10, 4, 20);

        // Method calls to compute wage
        dMart.computeEmpWage();
        reliance.computeEmpWage();
	}
}
