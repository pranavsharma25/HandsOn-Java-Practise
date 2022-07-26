package workingWithStatic;

public class Firstprogram {

	public static void main(String[] args) {
		
		College col1 = new College(1, "Person1");
		col1.changeCollege("NIT");
		
		College col2 = new College(2, "Person2");
		College col3 = new College(3, "Person3");
		
		col1.display();
		col2.display();
		col3.display();

	}

}
