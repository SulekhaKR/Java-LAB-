public class Employee {
    protected int employeeId;
    protected String employeeName;
    protected String designation;

    public Employee(int id, String name, String designation) {
        this.employeeId = id;
        this.employeeName = name;
        this.designation = designation;
    }

    public void calculateBonus() {
        System.out.println("Calculating bonus for base Employee");
    }
}
