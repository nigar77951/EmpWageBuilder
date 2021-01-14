public interface IEmpWageBuilder {
    public void computeEmpWage();
    public void addCompanyEmpWage(String company, int empRatePerHr, int noOfWorkingDays, int maxHrsPermonth);
}
