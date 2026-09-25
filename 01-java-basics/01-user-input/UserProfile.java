import java.util.Scanner;

public class UserProfile{


    public static void main (String [] args ){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your Age:");
        int age = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter your Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Your City: ");
        String city = sc.nextLine();
        System.out.println("Enter your Salary: ");
        double salary = sc.nextDouble();

        System.out.println("============ User Profile ============");
        System.out.println("Your age is: " + age);
        System.out.println("Your name is: " + name);
        System.out.println("Your city is: " + city);
        System.out.println("Your salary is: " + salary);
        
        sc.close();
    }
}