package hybridInheritancePracise;


class vehicle {
    String type = "Car";
    String brand = "BMW";
    
    void display() {
    	System.out.println("This is the super class method");
    }
    
    vehicle (){
    	System.out.println("This is he super class consructor");
    }
    
}


class x3 extends vehicle{
	int price = 5000000;
	String color = "Black";

	void displayx3() {
		System.out.println(type+" "+brand+" "+price+" "+color);
	}
	
}

class x4 extends vehicle{
	int price = 6000000;
	String color = "White";

	void displayx4() {
		System.out.println(type+" "+brand+" "+price+" "+color);
	}
	x4(){
		System.out.println("This is the local class constructor");
	}
	
}

class x5 extends vehicle{
	int price = 7000000;
	String color = "Red";

	void displayx5() {
		System.out.println(type+" "+brand+" "+price+" "+color);
		
	}
	
	void display() {
		super.display();
	}
}

class x5NewModel extends x5{
	int mileage = 12;
	int price = 8500000;
	String color = "Red/Black";
	
	void displayx5NewModel() {
		System.out.println(type+" "+brand+" "+price+" "+color+" "+mileage);
	}
}
public class class1 {

	public static void main(String[] args) {
	
		//vehicle v1 = new vehicle();
		
		x3 xa = new x3();
		xa.displayx3();
		
		x4 xb = new x4();
		xb.displayx4();
		
		x5 xc = new x5();
		xc.displayx5();
		
				
		x5NewModel xd = new x5NewModel();
		xd.displayx5NewModel();
		
		xc.display();
		
		
		x4 xab = new x4();
		
		
		
		
		
		

	}

}
