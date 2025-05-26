Leap Year Checker:


import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        int y = new Scanner(System.in).nextInt();
        System.out.println((y % 4 == 0 && y % 100 != 0) || y % 400 == 0 ? "Leap Year" : "Not Leap Year");
    }
}