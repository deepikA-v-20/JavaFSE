package week1.excercise1;

import java.util.HashMap;
class Product{
    private String productid;
    private String productNAme;
    private int quantity;
    private double price;
    public Product(String productid,String productNAme,int quantity,double price){
        this.price=price;
        this.productNAme=productNAme;
        this.productid=productid;
        this.quantity=quantity;
    }
    public String getName(){
        return productNAme;
    }
    public String getId(){
        return productid;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    // public String setName(String productNAme){
    //     this.productNAme = productNAme;
    // }
    // public void setId(String productid){
    //     this.productid = productid;
    // }
    // public void setQuantity(double quantity){
    //     this.quantity = quantity;
    // }
    // public void setPrice(double price){
    //     this.price = price;
    // }

}

public class InventoryManagementSystem {
   HashMap<String,Product> map = new HashMap<>();
        public void addproduct(Product a){
            map.put(a.getId(),a);
        }
        public void remove(Product a){
            map.remove(a);
        }
        public void update(Product a){
            if(map.containsKey(a.getId())){
                map.put(a.getId(),a);
            }
        }
        public void printInventory() {
            for (Product product : map.values()) {
                System.out.println(product.getName() + ": " + product.getPrice());
            }
        }
    public static void main(String[] args) {
        InventoryManagementSystem obj = new InventoryManagementSystem();
        Product p1 = new Product("1001", "mobile",5,52350);
        Product p2 = new Product("1002", "bike", 250, 125605);
        System.out.println("Add the product");
        obj.addproduct(p1);
        obj.addproduct(p2);
        System.out.println("Remove the product");
        obj.remove(p2);
        obj.printInventory();
        System.out.println("Update the product");
        Product ip = new Product("1001", "car", 1, 250000);
        obj.update(ip);
        obj.printInventory();

    }
}

