
package it2d.bacus;


public class Accounts {
    
    int id;
    String Firstname;
    String Lastname;
    String Email;
    String Username;
    String Password;
    
    public void detailsAccount(int uid, String Fn, String Ln, String Eml, String Un, String pass){
        this.id = uid;
        this.Firstname = Fn;
        this.Lastname = Ln;
        this.Email = Eml;
        this.Username = Un;
        this.Password = pass;
       
    }
    
    public void viewAccount(){
        System.out.println("ID: "+this.id);
        System.out.println("Enter First name: "+this.Firstname);
        System.out.println("Enter Last name: "+this.Lastname);
        System.out.println("Enter Email:"+this.Email);
        System.out.println("Enter Username: "+this.Username);
        System.out.println("Enter Password:"+this.Password);
    }
}
