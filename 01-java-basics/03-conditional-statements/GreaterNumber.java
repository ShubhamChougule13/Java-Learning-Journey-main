import java.util.Scanner;

public class GreaterNumber{

    public static void main(String [] args){

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your number1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter your number2: ");
        int num2 = sc.nextInt();

        if(num1 > num2)
        {
           System.out.println("The Gretest number is: " + num1);
        }
        else if(num1 == num2)
        {
           System.out.println("Both numbers are equal");
        }
        else
        {
            System.out.println("The greatest number is: " + num2);
        }
        
        sc.close();
    }
}