package lesson3;
import java.util.Scanner;
public class Activity34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        double n = sc.nextDouble();
        double sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum of 1 to " + n + " is " + sum);
        System.out.println("The average is " +  (sum/n));
    }

}
