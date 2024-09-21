package it2d.bacus;

import java.util.Scanner;

public class Products {
    Product[] prod = new Product[100];

    public void products() {
        Scanner sc = new Scanner(System.in);
        int nums = 0;
        String choice; 
        
        do {
            System.out.println("--------------------------");
            System.out.println("WELCOME TO PRODUCT APP");
            System.out.println("--------------------------");
            System.out.println("1. ADD");
            System.out.println("2. VIEW");
            System.out.println("3. EDIT");
            System.out.println("4. DELETE");
            System.out.println("5. EXIT");
            System.out.println("--------------------------");

            System.out.print("Enter your choice: ");
            int option = sc.nextInt();

            while (option < 1 || option > 5) {
                System.out.print("Invalid Choice, Try Again: ");
                option = sc.nextInt();
            }

            switch (option) {
                case 1:
                    
                    System.out.print("Enter number of Products: ");
                    nums = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < nums; i++) {
                        System.out.println("Enter details of Product: " + (i + 1));

                        System.out.print("ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        
                        System.out.print("Customer's name: ");
                        String cName = sc.nextLine();

                        System.out.print("Product name: ");
                        String pName = sc.nextLine();

                        System.out.print("Quantity: ");
                        int qty1 = sc.nextInt();

                        System.out.print("Price: ");
                        double price1 = sc.nextDouble();

                        prod[i] = new Product();
                        prod[i].addProduct(id, cName, pName, qty1, price1);
                    }
                    break;

                case 2:
                   
                    if (nums == 0) {
                        System.out.println("No products to display.");
                    } else {
                        for (int i = 0; i < nums; i++) {
                            prod[i].viewProduct();
                        }
                    }
                   
                    break;

                case 3:
                 
                    System.out.print("Enter ID of the Product to edit: ");
                    int editID = sc.nextInt();
                    

                    for (int i = 0; i < nums; i++) {
                        if (prod[i].id == editID) { 
                            System.out.print("New Product name: ");
                            sc.nextLine();
                            String newName = sc.nextLine();

                            System.out.print("New Quantity: ");
                            int newQty = sc.nextInt();

                            System.out.print("New Price: ");
                            double newPrice = sc.nextDouble();

                            prod[i].editProduct(newName, newQty, newPrice); 
                            
                            break;
                        }
                    }
                    
                    break;
            }

          
            System.out.print("Want to continue (yes/no)?: ");
            choice = sc.next();

        } while (choice.equals("yes") || choice.equals("Yes"));

       
    }
}
