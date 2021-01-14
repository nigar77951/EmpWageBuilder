public class EmpWageFinder {
        public static void main(String[] args) {

        System.out.println("...Managing company wage for multiple companies...");

        // Object creation
        EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();

        // Invoking fn's through object
        empWageBuilder.addCompanyEmpWage("Google", 20, 2, 10);
        empWageBuilder.addCompanyEmpWage("Facebook", 40, 2, 10);
        empWageBuilder.addCompanyEmpWage("Amazon", 30, 2, 10);
        empWageBuilder.addCompanyEmpWage("Wipro", 25, 2, 10);
        empWageBuilder.addCompanyEmpWage("Tcs", 20, 2, 10);

        // Method call to compute wage
        empWageBuilder.computeEmpWage();

    }
}
