
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // Boşluq
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // ulduz
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


