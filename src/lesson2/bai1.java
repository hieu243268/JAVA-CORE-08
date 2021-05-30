package lesson2;

import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n: ");
        int n= sc.nextInt();

        System.out.println("Expect output: ");
        System.out.println(n + " + " + n + n + " + " + n + n + n + " = " +(n +10*n+n +10*10*n+n));
    }
}
