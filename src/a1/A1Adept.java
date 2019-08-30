package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int storeItemnum = scan.nextInt(); 

		String[] Itemlist = new String[storeItemnum];
		double[] price = new double[storeItemnum];
		
		for (int i = 0; i < storeItemnum; i++) {
			Itemlist[i] = scan.next();
			price[i] = scan.nextDouble();
		}
		
		int numCustomer = scan.nextInt();
		double total = 0.0;
		
		String[] firstName = new String[numCustomer];
		String[] lastName = new String[numCustomer];
		double biggest =0;
		double smallest = 0;
		double avgTotal = 0;
		String biggestName = "";
		String smallestName = "";
		for (int i = 0; i < numCustomer; i++) {
			
			firstName[i] = scan.next();
			lastName[i] = scan.next();
			
			int numItems = scan.nextInt();
			total = 0;
			for(int j = 0; j < numItems; j++) {
				
				int indNum = scan.nextInt();
				String temp = scan.next(); 
				for (int k=0; k < Itemlist.length; k++) {
				if(temp.equals(Itemlist[k])) {
					total += indNum * price[k];
					} 
				}
			
			}
			if (smallest == 0) {
				smallest = total;
			}
			if (total >= biggest) {
				biggest = total;
				biggestName = firstName[i] + " " + lastName[i];
			} 
			if (total <= smallest) {
				smallest = total;
				smallestName = firstName[i] + " " + lastName[i];
			}
			
			avgTotal += total;
			
		}
		avgTotal = avgTotal / numCustomer;
		//System.out.println(firstName[i].charAt(0)+ ". " + lastName[i] + ": " + total);
		System.out.println("Biggest: " + biggestName + " " + "(" +String.format("%.2f", biggest)+")");
		System.out.println("Smallest: " + smallestName + " " + "(" + smallest + ")");
		System.out.println("Average: " + String.format("%.2f", avgTotal));
	}
		
}
