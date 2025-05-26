String Reversal:


import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        System.out.println(new StringBuilder(str).reverse());
    }
}