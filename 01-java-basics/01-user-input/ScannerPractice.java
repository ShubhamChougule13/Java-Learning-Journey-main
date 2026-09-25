import java.util.Scanner;
public class ScannerPractice{

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        int age;
        String name;  

        System.out.println("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Enter your age: ");
        age = sc.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        sc.close();
      
    }
}
