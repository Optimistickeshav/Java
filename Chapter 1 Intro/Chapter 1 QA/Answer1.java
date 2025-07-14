public class Answer1 {
    public static void main(String[] args) {
        double basicSalary = 30000.0; // Assume a suitable basic salary

        double dearnessAllowance = 0.40 * basicSalary; // 40% of basic
        double houseRentAllowance = 0.20 * basicSalary; // 20% of basic

        double grossSalary = basicSalary + dearnessAllowance + houseRentAllowance;

        System.out.println("Basic Salary: ₹" + basicSalary);
        System.out.println("Dearness Allowance (40%): ₹" + dearnessAllowance);
        System.out.println("House Rent Allowance (20%): ₹" + houseRentAllowance);
        System.out.println("-------------------------------------");
        System.out.println("Gross Salary: ₹" + grossSalary);
    }
}
