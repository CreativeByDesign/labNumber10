import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the radius: ");
		int radius= scan.nextInt();
		Circle lemonHead = new Circle(radius);
		
		
		System.out.println("Circumferance: " + lemonHead.getFormattedCircumferance() );
		System.out.println("Area: " + lemonHead.getformattedArea());

	}

	

}
