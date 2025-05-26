Array Sum and Average:


import java.util.Scanner;
public class ArrayStats {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), sum = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) sum += (arr[i] = s.nextInt());
        System.out.println("Sum: " + sum + ", Avg: " + (sum / (double) n));
    }
}