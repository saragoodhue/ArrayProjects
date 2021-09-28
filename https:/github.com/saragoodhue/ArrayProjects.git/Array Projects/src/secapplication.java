import java.util.Scanner;

public class secapplication {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input the number of the month you wish to know: ");
		int value = scanner.nextInt();
		
		String[] months;
		
		months = new String[13];
		
		months[1] = "January";
		months[2] = "February";
		months[3] = "March";
		months[4] = "April";
		months[5] = "May";
		months[6] = "June";
		months[7] = "July";
		months[8] = "August";
		months[9] = "September";
		months[10] = "October";
		months[11] = "November";
		months[12] = "December";
		
		System.out.print(months[value]);	

	}

}
