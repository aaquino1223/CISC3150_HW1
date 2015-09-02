import java.util.*;

//Main method will read in numbers and print them out
public class Question4_Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] input = new int[10];
		
		System.out.println("Please read in some numbers\n");
		
		int i = 0;
		
		while(scanner.hasNextInt()) {
			input[i++] = scanner.nextInt();
		}
		
		System.out.println("The numbers that were read in: ");
		
		for(int x : input) {
			System.out.println(x);
		}
	}
}