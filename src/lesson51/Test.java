package lesson51;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng học sinh: ");
        int n = scanner.nextInt();
        StudentManagement s = new StudentManagement(n);
        System.out.println("Tổng số sinh viên đỗ: " + s.count(true));
        System.out.println("Tổng số sinh viên trượt: " + s.count(false));
        System.out.println("Thông tin sinh viên có điểm số cao nhất: " + s.Max());
        System.out.println("Thông tin sinh viên có điểm số thấp nhất: " + s.Min());

    }
}


