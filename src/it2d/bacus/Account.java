
package it2d.bacus;

import java.util.Scanner;

public class Account {
    
       public void personInfo(){
        Scanner sc = new Scanner (System.in);
        Account[] acc = new Account[100];
        
        System.out.printf("Enter no. of Accounts: ");
        int nums = sc.nextInt();
        
        for (int i = 0; i < nums; i++) {

            System.out.println("Enter details of User: " + (i + 1));
            System.out.print("Enter ID: ");
            int uid = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter First Name: ");
            String Fn = sc.nextLine();

            System.out.print("Enter Last Name: ");
            String Ln = sc.nextLine();

            System.out.print("Enter Email: ");
            String Eml = sc.nextLine();

            System.out.print("Enter Username: ");
            String Un = sc.nextLine();

            String pass;
            while (true) {

            System.out.print("Enter Password: ");
                pass = sc.nextLine();
             if (isValidPassword(pass)) {
                    break;
                } else {
                    System.out.println("Password must be at least 8 characters long"
                            + " and contain at least one uppercase letter, "
                            + "one lowercase letter, and one number. Please try again.");
                }
            }
        }
        sc.close();
    }

    
    private boolean isValidPassword(String password) {
    
        return password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d).{8,}$");
    }

    }
       
        

