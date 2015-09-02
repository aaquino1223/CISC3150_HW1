import java.util.*;

//Question 6
//Main method determines relationship between two circles based on radius and center
//coordinates entered by user
public class Question6_Main {
	
	public static class Circle {
		int x, y, radius;
		
		public Circle() {}
	}
	
	public static void main(String[] args) {
		Circle A = new Circle();
		Circle B = new Circle();
		double distance;
		String ans;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Please enter the center coordinates for Circle A");
			A.x = scanner.nextInt();
			A.y = scanner.nextInt();
			
			System.out.println("Now enter the radius for Circle A");
			A.radius = scanner.nextInt();
			
			System.out.println("\nPlease enter the center coordinates for Circle B");
			B.x = scanner.nextInt();
			B.y = scanner.nextInt();
			
			System.out.println("Now enter the radius for Circle B");
			B.radius = scanner.nextInt();
			
			System.out.println("\nCalculating relationship between:");
			System.out.println("Circle A - Center: (" + A.x + ", " + A.y + ") Radius: " + A.radius);
			System.out.println("Circle B - Center: (" + B.x + ", " + B.y + ") Radius: " + B.radius);
			
			distance = Math.sqrt(Math.pow(A.x - B.x, 2) + Math.pow(A.y - B.y, 2));
			
			if(A.x == B.x && A.y == B.y && A.radius == B.radius) {
				System.out.println("Circle A and Circle B are completely within one another\n");
			}
			else if(distance > A.radius + B.radius) {
				System.out.println("Circle A and Circle B are seperate from each other\n");
			}
			else if(distance == A.radius + B.radius) {
				System.out.println("Circle A and Circle B are touching each other\n");
			}
			else if(distance < A.radius + B.radius) {
				System.out.println("Circle A and Circle B are overlapping each other\n");
			}
			
			System.out.println("Would you like to try again? Y/N");
			ans = scanner.next();
			
		} while(ans.equals("Y") || ans.equals("y"));
				
		System.out.println("END OF PROGRAM");
	}
}
			