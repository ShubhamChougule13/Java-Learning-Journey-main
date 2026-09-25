import java.util.Scanner;

public class LargestOf3{

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter your Num2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter your Num3: ");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3)
        {
            System.out.println("The Greatest number is " + num1);
        }
        else if(num2 > num1 && num2 > num3)
        {
            System.out.println("The Greatest number is " + num2);
        }
        else
        {
              System.out.println("The Greatest number is " + num3);
        }
       sc.close();
    }
}