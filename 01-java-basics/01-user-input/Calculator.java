import java.util.Scanner;

public class Calculator{

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient =  num1 / num2;
        int remainder = num1 % num2;


        System.out.println("=========== Calculator Results ===========");

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        System.out.println("The difference of " + num1 + " and " + num2 + " is: " + difference);
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
        System.out.println("The quotient of " + num1 + " and " + num2 + " is: " + quotient);
        System.out.println("The remainder of " + num1 + " and " + num2 + " is: " + remainder);
        sc.close();


    }
}