package BAITAP.BAI1;

import java.util.Scanner;

public class bai1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input first number: ");
            double a = sc.nextDouble();
            sc = new Scanner(System.in);
            System.out.print("Input second number: ");
            double b = sc.nextDouble();
            System.out.println("Expected Output: ");
            System.out.println(a + b);
            System.out.println(a - b);
            System.out.println(a * b);
            System.out.println(a / b);
            System.out.println(a % b);
        }
}
