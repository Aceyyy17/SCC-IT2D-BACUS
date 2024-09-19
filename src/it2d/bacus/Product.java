package it2d.bacus;



public class Product {
     int id;
     String cName;
     String pName;
     int qty;
     double price;

    public void addProduct(int cid, String customerName, String productName, int quantity, double price) {
        this.id = cid;
        this.cName = customerName;
        this.pName = productName;
        this.qty = quantity;
        this.price = price;
    }

    public void viewProduct() {
        double totalDue = qty * price;
        System.out.printf("%-10d %-10s %-10s %-10d %-10.2f %.2f\nTotal Due: %.2f\n",this.id, 
                this.cName, this.pName, this.qty, this.price, totalDue);
    }

    public void editProduct(String productName, int quantity, double price) {
        this.pName = productName;
        this.qty = quantity;
        this.price = price;
    }

    
}
    