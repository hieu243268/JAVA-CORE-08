package lesson3;
import java.util.Scanner;

public class Activity32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n= ");
        int n= sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n-i + 1; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int c = 1; c <= i; c++) {
                System.out.print("*");
            }
            for (int c = i - 1; c >= 1; c--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

