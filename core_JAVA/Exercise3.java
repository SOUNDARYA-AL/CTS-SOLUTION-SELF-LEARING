Even or Odd Checker:

import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        System.out.println((num % 2 == 0) ? "Even" : "Odd");
    }
}