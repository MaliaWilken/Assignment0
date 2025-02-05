import java.util.Scanner;

public class InternetServiceProviderActivity {

	public static void main(String[] args) {
		
		System.out.println("Enter Package Letter Purchased (A, B, or C): ");
		System.out.println("Enter Number of Hours Used: ");
		
		Scanner scnr = new Scanner(System.in);
		String choice = scnr.nextLine().toUpperCase();
		int hours = scnr.nextInt();
		int paidHours;
		double monthlyBill = 0.0;
		
		switch (choice) {
		case "A":
		//case "a":
			paidHours = Math.max(0,  hours - 10);
			monthlyBill = 9.95 + 2*(paidHours);
			break;
		case "B":
		//case "b":
			paidHours = Math.max(0,  hours - 20);
			monthlyBill = 13.95 + 1*(paidHours);
			break;
		case "C":
		//case "c":
			monthlyBill = 19.95;
			break;
		default:
			System.out.println("Bad Input");
		}
		
		System.out.println("Monthly Bill: $" + monthlyBill);
		
		scnr.close();
		
		

	}

}
