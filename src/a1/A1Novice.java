package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		int numCustomer = scan.nextInt();
		double total = 0.0;
		String[] firstName = new String[numCustomer];
		String[] lastName = new String[numCustomer];
		for (int i = 0; i < numCustomer; i++) {
			total = 0;
			firstName[i] = scan.next();
			lastName[i] = scan.next();
			int numItems = scan.nextInt();
			for(int j = 0; j < numItems; j++) {
				int indNum = scan.nextInt();
				String itemName = scan.next();
				double price = scan.nextDouble();
				total += indNum * price;
			}
			System.out.println(firstName[i].charAt(0)+ ". " + lastName[i] + ": " + String.format("%.2f", total));
		}
		
		
	}
}
