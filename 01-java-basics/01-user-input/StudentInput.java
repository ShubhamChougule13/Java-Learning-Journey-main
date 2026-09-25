import java.util.Scanner;
public class StudentInput{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter student name: ");
        String name = sc.nextLine();
        System.out.println("Enter student age: ");
        int age = sc.nextInt();
        System.out.println("Enter your percentage: ");
        double percentage = sc.nextDouble();
        System.out.println("Enter your Grade: ");
        char grade = sc.next().charAt(0);
        System.out.println("Are you learning Java?: ");
        boolean isLearningJava = sc.nextBoolean();


        
        System.out.println("========= Student Details =========");
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Percentage: " + percentage);
        System.out.println("Student Grade: " + grade);
        System.out.println("IS you Learning Java: " + isLearningJava);

        sc.close();
    }
}
 
