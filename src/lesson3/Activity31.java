package lesson3;
import java.util.Scanner;
public class Activity31 {
    public static int fib(int n){
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input fibonacci lenght: ");
        int n = sc.nextInt();
        System.out.println("Expect output:");
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i)+",");
        }
    }
}