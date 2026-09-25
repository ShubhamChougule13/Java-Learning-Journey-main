import java.util.Scanner;
public class Employee{

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Employee Id: ");
        double id = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter Employee Company Name: ");
        String company = sc.nextLine();
        System.out.println("Enter Employee Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();
        System.out.println("Is Employee Permanent? (true/false): ");
        boolean isPermanent = sc.nextBoolean();
     

        System.out.println("============ Employee Details ============");
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Id: " + id);
        System.out.println("Employee Company: " + company);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Is Employee Permanent: " + isPermanent);
        sc.close();
    }
}