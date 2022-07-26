package encpEx2;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	private double bonus;
	private double netSalary;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	
	
	public void setNetSalary() {
		
		netSalary = salary+bonus;
	}
	
public double getNetSalary() {
		
		return netSalary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", bonus=" + bonus + ", netSalary="
				+ netSalary + "]";
	}

	

	

	
	
	
	
	

}
