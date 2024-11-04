public class TestPayrollSystem {
    public static void main(String[] args) {
        HourlyEmployee hourly = new HourlyEmployee(1, "John Doe", "Technician", 15.0, 40);
        SalariedEmployee salaried = new SalariedEmployee(2, "Jane Smith", "Manager", 4000.0);
        ExecutiveEmployee executive = new ExecutiveEmployee(3, "Alice Brown", "CEO", 12000.0, 10);

        System.out.println("Weekly Salary for Hourly Employee: $" + hourly.calculateWeeklySalary());
        hourly.calculateBonus();

        System.out.println("Weekly Salary for Salaried Employee: $" + salaried.calculateWeeklySalary());
        salaried.calculateBonus();

        executive.calculateBonus();
    }
}
