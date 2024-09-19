
package it2d.bacus;

import java.util.Scanner;

public class Products {

    
    
    public void products(){
        Scanner sc = new Scanner (System.in);  
        Product[] prod = new Product[100];
        int nums = 0;
        String choice;
        do{

        System.out.println("--------------------------");
        System.out.println("WELCOME TO Product APP");
        System.out.println("--------------------------");
        System.out.println("1. ADD");
        System.out.println("2. VIEW");
        System.out.println("3. EDIT");
        System.out.println("4. DELETE");
        System.out.println("5. EXIT");
        System.out.println("--------------------------");
        
        System.out.print("Enter Option: ");
        int option = sc.nextInt();

        while(option > 5){
            System.out.print("Invalid Selection, Try Again: ");
            option = sc.nextInt();
        }
         switch(option){
            
        case 1:
        System.out.print("Enter no. of Products: ");
        nums = sc.nextInt();

        for(int i=0; i < nums; i++){
        System.out.print("Enter details of Product: "+(i+1));
        
        System.out.print("ID: ");
        int id = sc.nextInt();
        
        System.out.print("Customer's name: ");
        String cName = sc.nextLine();
       
        System.out.print("Product name: ");
        String pName = sc.nextLine();
        
        System.out.print("Quantity: ");
        int qty1 = sc.nextInt();
        
        System.out.print("Price: ");
        double price1 = sc.nextInt();
        
        System.out.print("Cash: ");
        double cash1 = sc.nextInt();
        
        prod[i] = new Product();
        prod[i].addProduct(id, cName, pName, qty1, price1, cash1);
        }

        break;
        case 2:
        for(int i=0; i < nums; i++){
        prod[i].viewProduct();
        }
        break;
        case 3:

        System.out.println("Enter ID of the Product: ");
        int idin = sc.nextInt();

        for (int i = 0; i < nums; i++) {
        if (prod[i].id == idin) {
        System.out.print("New Product: ");
        double prelim = sc.nextDouble();
        prod[i].editProducts(idin, Product);
        break;
                    }
                }
        break;
        
         }
        System.out.println("Want to continue(yes/no)?: ");
        choice = sc.next();
        
    
         
    }while(choice.equals("y") || choice.equals("y")); 
        
    }   

    
