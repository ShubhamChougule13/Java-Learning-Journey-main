public class Day1Task{


    public static void main (String [] args){
    
    System.out.println("========= Invoice =========");

    String productName = "Macbook Air pro M5";
    double productPrice = 150000.50;
    int productQuantity = 3;
    double totalPrice;
    double discount = 5000;
    double finalPrice;

     totalPrice = productPrice * productQuantity;
     finalPrice = totalPrice - discount;
 
    System.out.println("Product Name: " + productName);
    System.out.println("Product Price: " + productPrice);
    System.out.println("Product Quantity: " + productQuantity);
    System.out.println("Total Price: " + totalPrice);
    System.out.println("Discount: " + discount);
    System.out.println("Final Price: " + finalPrice);

    }
}