import java.util.Scanner;

public class ProductBill{

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("What is the Name of  the Product?: ");
        String productName = sc.nextLine();

        System.out.println("What is the Price of the Product?: ");
        double productPrice = sc.nextDouble();

        System.out.println("What is the Quantity of the Product?: ");
        int productQuantity = sc.nextInt();

        System.out.println("What is the Discount on the Product?: ");
        double discount = sc.nextDouble();

        double totalAmount = productPrice * productQuantity;
        double finalAmount = totalAmount - discount;

        System.out.println("=========== Product Bill ===========");
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: $" + productPrice);
        System.out.println("Product Quantity: " + productQuantity);
        System.out.println("Total Amount: $" + totalAmount);
        System.out.println("Final Amount: $" + finalAmount);
        sc.close();
    }
}