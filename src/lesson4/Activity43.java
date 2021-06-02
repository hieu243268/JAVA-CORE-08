package lesson4;
import java.util.Scanner;
import java.util.Arrays;
public class Activity43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the 1st array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements of the 1st array: ");
        for (int i = 0; i < n; i++) {
            sc = new Scanner(System.in);
            System.out.print("a[" + (i) + "] = ");
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the size of the 2nd array: ");
        int m = sc.nextInt();
        int[] b = new int[m];
        System.out.println("Enter elements of the 2nd array: ");
        for (int i = 0; i < m; i++) {
            sc = new Scanner(System.in);
            System.out.print("b[" + (i) + "] = ");
            b[i] = sc.nextInt();
        }
        System.out.println("Original array:");
        System.out.println("Length= " + n);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Length= " + m);
        for (int i = 0; i < m; i++) {
            System.out.print(b[i] + " ");
        }
        int c = m + n;
        int[] c1 = new int[c];
        System.arraycopy(a, 0, c1, 0, n);
        System.arraycopy(b, 0, c1, n, m);
        System.out.println();
        System.out.println("Merged array: ");
        System.out.println("Length: "+(m+n));
        System.out.println(Arrays.toString(c1));
    }
}
