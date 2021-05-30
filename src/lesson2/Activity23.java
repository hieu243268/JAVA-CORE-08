package lesson2;

import java.util.Scanner;
public class Activity23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        int a= sc.nextInt();
        System.out.println("Expected output: ");
        for(int i=0;i<=10;i++){
            System.out.println(a+"*"+i+"="+(a*i));
        }
    }

}
