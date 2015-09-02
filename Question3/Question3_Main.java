import java.util.*;

//Question 3
//Main method randomly prints out a month
public class Question3_Main {
	public static void main(String[] args) {
		String[] months = new String[12];
		Random rand = new Random();
		
		months[0] = "January";
		months[1] = "February";
		months[2] = "March";
		months[3] = "April";
		months[4] = "May";
		months[5] = "June";
		months[6] = "July";
		months[7] = "August";
		months[8] = "September";
		months[9] = "October";
		months[10] = "November";
		months[11] = "December";
		
		System.out.println("The random month is " + months[rand.nextInt(12)]);
	}
}