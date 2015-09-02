import java.util.*;

//Question 5
//Main method validates triangle based on coordinates entered by user
public class Question5_Main {
	
	public static class Point {
		public int x, y;
		
		public Point() {}
	}
	
	public static void main(String[] args) {
		double ab, bc, ac;
		String ans;
		Point A = new Point();
		Point B = new Point();
		Point C = new Point();
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Please enter the coordinates of Point A of the triangle");
			A.x = scanner.nextInt();
			A.y = scanner.nextInt();
			
			System.out.println("Please enter the coordinates of Point B of the triangle");
			B.x = scanner.nextInt();
			B.y = scanner.nextInt();
			
			System.out.println("Please enter the coordinates of Point C of the triangle");
			C.x = scanner.nextInt();
			C.y = scanner.nextInt();
		
			System.out.println("Validating triangle with points: (" + A.x + ", " + A.y + ") (" 
				+ B.x + ", " + B.y + ") (" + C.x + ", " + C.y + ")\n");
			
			ab = Math.sqrt(Math.pow(A.x - B.x, 2) + Math.pow(A.y - B.y, 2));
			bc = Math.sqrt(Math.pow(B.x - C.x, 2) + Math.pow(B.y - C.y, 2));
			ac = Math.sqrt(Math.pow(A.x - C.x, 2) + Math.pow(A.y - C.y, 2));
			
			if(ab + bc > ac && ab + ac > bc && bc + ac > ab) {
				System.out.println("This is a real triangle\n");
			}
			else {
				System.out.println("This is not a real triangle\n");
			}
			
			System.out.println("Would you like to try again? Y/N");
			ans = scanner.next();
			
		} while(ans.equals("Y") || ans.equals("y"));
		
		System.out.println("END OF PROGRAM");
	}
}
