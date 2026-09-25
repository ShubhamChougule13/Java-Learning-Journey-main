import java.util.Scanner;

public class Palindrome{

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no to check Palindrome: ");
        int num = sc.nextInt();
        int rev = 0;
        int original = num;
        
        while(num != 0)
        {
            rev = rev * 10;
            rev = rev + num % 10;
            num = num / 10;

        }
        if (original == rev)
        {
            System.out.println("Number is Palindrome");
        }
        else
        {
            System.out.println("Number is not Palindrome");
        }

        sc.close();
    }
}