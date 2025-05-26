Grade Calculator:


import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        int marks = new Scanner(System.in).nextInt();
        char grade = (marks >= 90) ? 'A' : (marks >= 80) ? 'B' : (marks >= 70) ? 'C' : (marks >= 60) ? 'D' : 'F';
        System.out.println("Grade: " + grade);
    }
}