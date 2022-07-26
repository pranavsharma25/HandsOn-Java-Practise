package inheritancePractise;


class bike{
	int speed = 200;
	
	void display() {
		System.out.println("This is a bike");
	}
}

class R15 extends bike{
	int speed = 300;
	void speedofR15() {
		System.out.println(super.speed+120);
	}
	
	void display() {
		System.out.println("This is r15 class method");
	}
}

class yamahaNewModel extends bike{
	void SpeedOfnewR15() {
		System.out.println(speed+200);
	}
}

public class bikeEx {

	public static void main(String[] args) {
		
		yamahaNewModel r1 = new yamahaNewModel();
		r1.SpeedOfnewR15();
		r1.display();
		
		R15 ra = new R15();
		ra.speedofR15();
		
		bike bike01 = new R15();
		bike01.display();
		
		

	}

}
