package mathclass;

import java.util.Scanner;

public class Mathclass_continued {
	public static void main(String[]args) {
		
		double x;
		double z;
		double y;
		
		Scanner scanner = new Scanner(System.in);
		
	System.out.println("Enter side x: ");
	x = scanner.nextDouble();
	
	System.out.println("Enter side y: ");
	y = scanner.nextDouble();

	z = Math.sqrt((x*x)+(y*y));             // square root in java c=a*a+b*b 
	
	System.out.println("The total hypotenuse is : "+z);
	
	scanner.close();
	
}

}
