import java.util.Scanner;

public class LoginCheck{

    public static void main (String [] args){
        String username = "Shubham";
        String password = "java1234";

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Username: ");
        username = sc.nextLine();
        System.out.println("Enter Password: ");
        password = sc.nextLine();

        if (username.equals("Shubham") && password.equals("java1234"))
        {
            System.out.println("Login Successful....! ");
        }
        else
        {
            System.out.println("Invalid Username and Password");
        }
        sc.close();
    }
}