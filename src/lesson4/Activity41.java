package lesson4;
import java.util.Scanner;
public class Activity41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        int temp = 1;
        int rem = 0;
        int sum = 0;
        int i;
        float cube;
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            while (num != 0) { // điều kiện xảy ra để vòng lặp chạy
                rem = num % 10; // chia lấy dư để xét số
                cube = rem * rem * rem;// lập phương của các số.
                sum += cube; // cộng tổng
                num = num / 10; // chia lấy phần nguyên
            }
            if (sum == temp) // tổng bằng số among
                System.out.println("So Amongstrong là " + temp);
           rem = 0;
            sum = 0;
            cube = 0;
           temp = i + 1;
           num = i + 1;
        }
    }
}
