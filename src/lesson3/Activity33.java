package lesson3;
import java.util.Scanner;
public class Activity33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= 1;
        long x=1;
        double e=1;
        System.out.println("Nhap e: ");
        double epsilon= sc.nextDouble();
        if(epsilon>=1){
            System.out.println("Nhap lai: ");
            epsilon= sc.nextDouble();
        }while (epsilon<=(1.0/x)){
            x*=n;
            e+=1.0/x;
            n++;
        }
        System.out.println("Ket qua e="+e);
        }
}
