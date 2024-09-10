
package it2d.bacus;

import java.util.Scanner;

public class Products {
    
    public void products(){
        Scanner input = new Scanner (System.in);
            
        String Cname;
        String Pname;
        int qty, price;
        double cash, due, change;
        
        System.out.print("Customer's name: ");
        Cname = input.nextLine();
        
        System.out.print("Product name: ");
        Pname = input.nextLine();
        
        System.out.print("Quantity: ");
        qty = input.nextInt();
        
        System.out.print("Price: ");
        price = input.nextInt();
        
        System.out.print("Cash: ");
        cash = input.nextInt();
        
        
        
        System.out.println("\n-------------------------------");
        System.out.println("RECEIPT");
        System.out.println("-------------------------------");
        
        System.out.println("Name:"+Cname+"\nProduct name: "+Pname+"\nQuantity"+qty);
        System.out.println("-------------------------------");
        
        due = qty*price;
        System.out.println("Total due: "+ String.format("%.2f",due));
        System.out.println("'\nCash: "+ String.format("%.2f",cash));
        
         System.out.println("-------------------------------");
         change = cash-due;
         
         System.out.println("Change: "+ String.format("%.2f",change));
        
        
        
    }
    
}
