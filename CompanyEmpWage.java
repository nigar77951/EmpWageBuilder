public class CompanyEmpWage {

    // Variables
    public final String company;
    public final int empRatePerHr;
    public final int noOfWorkingDays;
    public final int maxHrsPermonth;
    public int totalEmpWage;

    // Constructor
    public CompanyEmpWage(String company, int empRatePerHr, int noOfWorkingDays, int maxHrsPermonth) {
        this.company = company;
        this.empRatePerHr = empRatePerHr;
        this.noOfWorkingDays = noOfWorkingDays;
        this.maxHrsPermonth = maxHrsPermonth;
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    @Override
    public String toString() {
        return "Total Emp Wage for Company:" + company + " is: " + totalEmpWage + "\n";
    }
}
