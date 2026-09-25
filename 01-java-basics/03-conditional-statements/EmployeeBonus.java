import java.util.Scanner;

public class EmployeeBonus{

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Employee Salary: ");
        Double salary = sc.nextDouble();
        System.out.println("Enter Employee Experience: ");
        int experience = sc.nextInt();

        double bonus = 0;
        double totalSalary = 0;

        if(experience < 1 && experience >= 0)
        {
            bonus = 0;
        }
        else if ( experience > 1  && experience <= 2)
        {
           bonus = salary * 5 / 100;
        }
        else if (experience >= 3 && experience <= 5)
        {
            bonus = salary * 10 / 100;    
        }
        else if( experience > 5)
        {
            bonus = salary * 15 / 100; 
        }
        else 
        {
            System.out.println("Invalid Experience");
        }
        
            totalSalary = bonus + salary; 

        System.out.println("========== Employee Bonus ==========");
        System.out.println("Employee name: " + name);
        System.out.println("Employee salary: " + salary);
        System.out.println("Employee experience: " + experience);
        System.out.println("Employee Bonus: " + bonus);
        System.out.println("Employee Total Salary: " + totalSalary);
        

        sc.close();

    }
}