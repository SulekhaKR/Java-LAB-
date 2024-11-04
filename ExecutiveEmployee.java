public class ExecutiveEmployee extends SalariedEmployee {
    private double bonusPercentage;

    public ExecutiveEmployee(int id, String name, String designation, double salary, double bonusPercent) {
        super(id, name, designation, salary);
        this.bonusPercentage = bonusPercent;
    }

    @Override
    public void calculateBonus() {
        super.calculateBonus();
        System.out.println("Executive employee bonus as a percentage of annual salary");
    }
}
