public class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee(int id, String name, String designation, double salary) {
        super(id, name, designation);
        this.monthlySalary = salary;
    }

    public double calculateWeeklySalary() {
        return monthlySalary / 4;
    }

    @Override
    public void calculateBonus() {
        super.calculateBonus();
        System.out.println("Salaried employee bonus calculation");
    }
}
