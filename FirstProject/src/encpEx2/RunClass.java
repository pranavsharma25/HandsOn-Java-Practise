package encpEx2;

public class RunClass {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
		e1.setId(101);
		e1.setName("Person1");
		e1.setSalary(50000);
		e1.setBonus(5000);
		e1.setNetSalary();
		
		
Employee e2 = new Employee();
		
		e2.setId(102);
		e2.setName("Person2");
		e2.setSalary(40000);
		e2.setBonus(5000);
		e2.setNetSalary();
		
Employee e3 = new Employee();
		
		e3.setId(103);
		e3.setName("Person3");
		e3.setSalary(60000);
		e3.setBonus(5000);
		e3.setNetSalary();
		
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);

	}
	
	
	

}
