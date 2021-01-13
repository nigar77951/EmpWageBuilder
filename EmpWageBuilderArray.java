public class EmpWageBuilderArray {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    // Variables
    private int numOfCompany = 0;
    private CompanyEmpWage[] companyEmpWageArray;

    // Constructor
    public EmpWageBuilderArray() {
        companyEmpWageArray = new CompanyEmpWage[5];
    }

    private void addCompanyEmpWage(String company, int empRatePerHr, int noOfWorkingDays, int maxHrsPermonth) {
        companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRatePerHr, noOfWorkingDays, maxHrsPermonth);
        numOfCompany++;
    }

    private void computeEmpWage() {
        for (int i = 0; i < numOfCompany; i++) {
            companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);
        }
    }

    // method to compute wage
    public int computeEmpWage(CompanyEmpWage companyEmpWage) {
        // Variables
        int empHrs = 0;
        int totalEmpWage = 0;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;

        // Computation
        while (totalEmpHrs <= companyEmpWage.maxHrsPermonth && totalWorkingDays < companyEmpWage.noOfWorkingDays) {
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
        return totalEmpHrs * companyEmpWage.empRatePerHr;
    }

    public static void main(String[] args) {

        System.out.println("...Managing company wage for multiple companies...");

    // Object creation
        EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();

    // Invoking fn's through object
    empWageBuilder.addCompanyEmpWage("Dmart", 20, 2, 10);
        empWageBuilder.addCompanyEmpWage("Reliance", 10, 4, 20);

        // Method call to compute wage
        empWageBuilder.computeEmpWage();

    }
}

