Simple Calculator:

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble(), b = s.nextDouble();
        char op = s.next().charAt(0);
        double res = (op == '+') ? a + b : (op == '-') ? a - b : (op == '*') ? a * b : a / b;
        System.out.println("Result: " + res);
    }
}
