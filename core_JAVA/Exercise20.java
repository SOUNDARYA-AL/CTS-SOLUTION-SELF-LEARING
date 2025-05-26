Try-Catch Example:

import java.util.Scanner;
public class Division {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            int a = s.nextInt(), b = s.nextInt();
            System.out.println("Result: " + a / b);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
    }
}