package NewExercise;

public class Employee {

int empid;
String empName;
String empEmail;
int empPhone;
double empSalary;

Employee(int empid, String empName, String empEmail, int empPhone, double empSalary) {
	
	this.empid = empid;
	this.empName = empName;
	this.empEmail = empEmail;
	this.empPhone = empPhone;
	this.empSalary = empSalary; 
	
}

void print() {
	System.out.println("Employee ID- "+this.empid+"Employee Name- "+this.empName+"Employee Email- "+this.empEmail+"Employee Phone - "+this.empPhone+"Employee Salary- "+this.empSalary);
}



}
