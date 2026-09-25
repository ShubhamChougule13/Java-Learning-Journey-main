import java.util.Scanner;

public class NumberAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check: ");
        int num = sc.nextInt();

        // 1. Positive, Negative or Zero
        String type;

        if (num > 0) {
            type = "Positive";
        } else if (num < 0) {
            type = "Negative";
        } else {
            type = "Zero";
        }

        // 2. Even or Odd
        String evenOdd;

        if (num % 2 == 0) {
            evenOdd = "Even";
        } else {
            evenOdd = "Odd";
        }

        // Use absolute value for digit calculations
        int tempNum = Math.abs(num);

        // 3. Count Digits
        int digitCount = 0;

        if (tempNum == 0) {
            digitCount = 1;
        } else {
            while (tempNum > 0) {
                digitCount++;
                tempNum = tempNum / 10;
            }
        }

        // 4. Sum of Digits
        tempNum = Math.abs(num);

        int digitSum = 0;

        while (tempNum > 0) {
            digitSum += tempNum % 10;
            tempNum = tempNum / 10;
        }

        // 5. Reverse Number
        tempNum = Math.abs(num);

        int reversed = 0;

        while (tempNum > 0) {
            reversed = reversed * 10 + tempNum % 10;
            tempNum = tempNum / 10;
        }

        // 6. Palindrome
        String palindrome;

        if (num < 0) {
            palindrome = "No";
        } else if (num == reversed) {
            palindrome = "Yes";
        } else {
            palindrome = "No";
        }

        // Display Result
        System.out.println();
        System.out.println("===== Number Analyzer =====");
        System.out.println();
        System.out.println("Number: " + num);
        System.out.println("Type: " + type);
        System.out.println("Even/Odd: " + evenOdd);
        System.out.println("Number of digits: " + digitCount);
        System.out.println("Sum of digits: " + digitSum);
        System.out.println("Reverse: " + reversed);
        System.out.println("Palindrome: " + palindrome);

        sc.close();
    }
}