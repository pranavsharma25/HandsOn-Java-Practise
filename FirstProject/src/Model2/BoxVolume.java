//With return type, without arguments.

package Model2;

public class BoxVolume {

	public static void main(String[] args) {
		
		Box b2 = new Box();
		
		b2.l = 20;
		b2.b = 10;
		b2.h = 5;
		
		int volume = b2.volume();
		
		System.out.println();
		
		System.out.println("Volume= "+volume);
		

	}

}
