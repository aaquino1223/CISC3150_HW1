import java.util.*;

//Question 2
//main method will recieve input from the user
//and calculate the area of a circle through the inputted numbers
public class Question2_Main {
	public static void main(String[] args) {
		double radius;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the radius of a circle");
		
		while(scanner.hasNextDouble()) {
			radius = scanner.nextDouble();
			System.out.println("You typed in " + radius);
			System.out.println("The area is " + (Math.PI * Math.pow(radius, 2)) + '\n');
			
			System.out.println("Please enter the next radius");
		}
		
		System.out.println("\nNo more circles to calculate");
			
		scanner.close();
	}
}