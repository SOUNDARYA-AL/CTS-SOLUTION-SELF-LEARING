Factorial Calculator:

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt(), fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        System.out.println("Factorial: " + fact);
    }
}