package workingWithStatic;

public class College {
	
	int id;
	String name;
	static String college = "IIT";
	
	public College(int id, String name) {
		
		this.id = id;
		this.name = name;
		
	}
	
	
	void display(){
		
		System.out.println(id+" "+name+" "+college);

	}
	
	
	void changeCollege(String newCollege) {
		college = newCollege;
	}
	
	
}
