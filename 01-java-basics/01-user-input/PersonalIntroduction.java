import java.util.Scanner;

public class PersonalIntroduction{

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Name: ");
        String name = sc.nextLine();
        System.out.println("Enter your Age: ");
        int age = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter your City: ");
        String city = sc.nextLine();
        System.out.println("Enter your Course: ");
        String course = sc.nextLine();
        System.out.println("Enter your Dream Company: ");
        String dreamCompany = sc.nextLine();
        System.out.println("Enter your Expected Salary: ");
        double expectedSalary = sc.nextDouble();

        System.out.println("============ Personal Introduction ============");
        System.out.println("My name is: "  + name);
        System.out.println("I am" + age + " years old, and i live in " + city + ".");
        System.out.println("I am currently pursuing "+ course);
        System.out.println("My dream company is: " + dreamCompany);
        System.out.println("My expected salary is: $" + expectedSalary);
      
        sc.close();
    }
}