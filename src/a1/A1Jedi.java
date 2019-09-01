package a1;

import java.util.Scanner;

public class A1Jedi {

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
		int[] counterArray = new int[storeItemnum];
		int[] counterCustomer = new int[storeItemnum];
		String[] firstName = new String[numCustomer];
		String[] lastName = new String[numCustomer];
		for (int i = 0; i < numCustomer; i++) {
			
			firstName[i] = scan.next();
			lastName[i] = scan.next();
			
			int numItems = scan.nextInt();
			
			for(int j = 0; j < numItems; j++) {
				int indNum = scan.nextInt();
				String temp = scan.next(); 
				for (int a = 0; a < Itemlist.length; a++) {
					if (temp.equals(Itemlist[a])) {
						counterArray[a] += indNum;
						counterCustomer[a]++;
					}
				}
			}
		}
		for (int b = 0; b < Itemlist.length; b++) {
			if (counterArray[b] == 0) {
				System.out.println("No customers bought " + Itemlist[b]);
			} else {
				System.out.println(counterCustomer[b] + " " + "customers bought " + counterArray[b] + " " + Itemlist[b]);
			}
		}
	}
}
