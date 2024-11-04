public class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public HourlyEmployee(int id, String name, String designation, double rate, int hours) {
        super(id, name, designation);
        this.hourlyRate = rate;
        this.hoursWorked = hours;
    }

    public double calculateWeeklySalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void calculateBonus() {
        super.calculateBonus();
        System.out.println("Hourly employee bonus calculation");
    }
}
