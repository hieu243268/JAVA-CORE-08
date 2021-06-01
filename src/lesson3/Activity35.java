package lesson3;
import java.util.Scanner;
public class Activity35 {
    public void Binary(int n) {
        int binary[] = new int[40];
        int index = 0;
        while (n > 0) {
            binary[index++] = n % 2;
            n= n / 2;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }

    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        Activity35 obj = new Activity35();
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        System.out.println("Giá trị nhị phân của " + n +" là: ");
        obj.Binary(n);
        System.out.println();
    }
}
