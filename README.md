JAVA Lab 3

-Employee Class: Acts as the base class with attributes employeeId, employeeName, and
designation. It has a basic calculateBonus method, which prints a generic message.

- HourlyEmployee Class: Inherits from Employee and adds hourlyRate and hoursWorked
attributes. It has a calculateWeeklySalary method that computes the weekly salary by
multiplying the hourly rate by hours worked. It overrides calculateBonus to provide
additional information specific to hourly employees.

- SalariedEmployee Class: Inherits from Employee and introduces monthlySalary. It also has a
calculateWeeklySalary method, dividing the monthly salary by four to estimate weekly
earnings. It overrides calculateBonus to tailor the message for salaried employees.

- ExecutiveEmployee Class: Extends SalariedEmployee with an additional attribute
bonusPercentage and further overrides calculateBonus to indicate a bonus based on an
annual salary percentage.

- TestPayrollSystem Class: Contains the main method where instances of HourlyEmployee,
SalariedEmployee, and ExecutiveEmployee are created. Their weekly salaries are calculated,
and each class&#39;s specific calculateBonus method is called, demonstrating polymorphism in
action.
