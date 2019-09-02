package a1;

import java.util.Scanner;

public class A1Jedi {

   public static void main(String[] args) {
      String itemName;
      double price = 0;
      String firstName;
      String lastName;
      int itemKind =0;
      int itemQuant =0;
      double total =0.0;
      double average =0.0;
      double currentTotal= 0;
   
      
      
      
      
      Scanner scan = new Scanner(System.in);
      int itemNum = scan.nextInt();
      
      String[] fruit = new String[itemNum];
      double[] costs = new double[itemNum];
      int[] customer = new int[itemNum];
      int[] it = new int[itemNum];
      int[] custRepeated = new int[itemNum];
for (int i =0; i < itemNum; i ++) 
{
   itemName = scan.next();
   price = scan.nextDouble();
   fruit[i] = itemName;
   costs[i] = price;
   customer[i] = 0;
   it[i] = 0;
   custRepeated[i] =0;
   }
int numOfcustomer = scan.nextInt();

for (int j =0; j <numOfcustomer; j++ ) {
   
   firstName = scan.next();
   
   lastName = scan.next();
   
   itemKind = scan.nextInt();
      
   for (int k =0; k < itemKind; k ++) {
         
         
         itemQuant = scan.nextInt();
         
         String purchasedit = scan.next();
         
         for (int o =0; o < itemNum; o++) {
         
            if (purchasedit.equals(fruit[o])) {
               it[o] = it[o] + itemQuant;
               custRepeated[o] ++;
               if (custRepeated[o] < 2) {
            	   customer[o]++;
               }
               break;
            	}
            }
   }
   for (int u=0; u<custRepeated.length; u++) {
      custRepeated[u] = 0;
   }
   

   }
for (int i =0; i < itemNum; i ++) {
   if (customer[i] == 0) {
      System.out.println("No customers bought " + fruit[i]);
   }
   else {
      System.out.println(customer[i] + " customers bought " + it[i] + " " + fruit[i]);
   }
}

}
}

