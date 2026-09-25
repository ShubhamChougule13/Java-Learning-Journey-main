import java.util.Scanner;

public class StudentResult {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Java Marks: ");
        int marks1 = sc.nextInt();

        System.out.println("Enter SQL Marks: ");
        int marks2 = sc.nextInt();

        System.out.println("Enter HTML Marks: ");
        int marks3 = sc.nextInt();

        int total = marks1 + marks2 + marks3;
        double percentage = total / 3.0;

        String grade;

        if (marks1 < 35 || marks2 < 35 || marks3 < 35) {
            grade = "F";
        } else if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 80) {
            grade = "B";
        } else if (percentage >= 70) {
            grade = "C";
        } else if (percentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("========== Student Result ==========");
        System.out.println("Student Name: " + name);
        System.out.println("Java Marks: " + marks1);
        System.out.println("SQL Marks: " + marks2);
        System.out.println("HTML Marks: " + marks3);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);

        if (marks1 >= 35 && marks2 >= 35 && marks3 >= 35) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }

        sc.close();
    }
}