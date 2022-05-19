
public class Employee {

	 String name;
	 Double grossSalary;
	 Double tax;
	
	public Double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(Double percentage) {
		 grossSalary = (grossSalary * percentage/100) + grossSalary;
	}
}
