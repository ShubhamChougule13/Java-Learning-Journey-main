import java.util.Scanner;

/* This is program special case if we take input no starts with 0003450 then
    it will count only 4 digits because leading zeros are not counted in integer values.
    so if want to count leading zeros then we have to take input as String and then count
     length of string. 
*/

public class CountNum{
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no to count: ");
        long num = sc.nextLong();

        int count = 0;

        if (num == 0)
        {
            count = 1;
        }
        else
        {
          while(num != 0)
           {  
              num = num / 10;
              count++;
           }
        }
        System.out.println("Total Digits in number is : " + count);
        sc.close();
    }
}