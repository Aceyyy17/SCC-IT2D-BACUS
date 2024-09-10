
package it2d.bacus;
import java.util.Scanner;

public class Grade {
    
    public void getGradeinput(){
        Scanner sc = new Scanner (System.in);
        Grades[] gr = new Grades [100];
        
        System.out.printf("Enter no. of students: ");
        int nums = sc.nextInt();
        
        for(int i = 0; i < nums; i++){
            System.out.println("Enter details of students: "+(i+1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.printf("Enter Name: ");
            String name = sc.next();
            System.out.printf("Prelim: ");
            double pr = sc.nextDouble();
            System.out.printf("Midterm: ");
            double md = sc.nextDouble();
            System.out.printf("PreFinal: ");
            double pf = sc.nextDouble();
            System.out.printf("Final: ");
            double fn = sc.nextDouble();
            
            gr[i] = new Grades();
            gr[i].addGrades(name, id, pr, md, pf, fn);
        }
        
        for(int i =0; i < nums; i++){
            gr[i].viewGrades();
        }
    }
    
}
