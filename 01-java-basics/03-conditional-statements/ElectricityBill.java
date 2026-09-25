import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Units Consumed: ");
        int units = sc.nextInt();

        double bill = 0;

        if (units >= 0 && units <= 100) {

            bill = units * 5;

        } else if (units > 100 && units <= 200) {

            bill = (100 * 5) + ((units - 100) * 7);

        } else if (units > 200 && units <= 300) {

            bill = (100 * 5)
                    + (100 * 7)
                    + ((units - 200) * 10);

        } else if (units > 300) {

            bill = (100 * 5)
                    + (100 * 7)
                    + (100 * 10)
                    + ((units - 300) * 15);

        } else {

            System.out.println("Invalid Units");
        }

        System.out.println("Your Electricity Bill is: " + bill);

        sc.close();
    }
}