package lesson4;
import java.util.Arrays;
import java.util.Scanner;
public class Activity42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < n; i++) {
            sc = new Scanner(System.in);
            System.out.print("a[" + (i) + "] = ");
            a[i] = sc.nextInt();
        }
        System.out.println("Original array:");
        System.out.println("Length= " + n);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        int m= n;
        for(int i = 0; i < m; i++) {
                for (int j = i + 1; j < m; j++) {
                    if (a[i] == a[j]) {
                        a[j] = a[m - 1];
                        m--;
                        j--;
                    }
                }
            }
        int[] array1 = Arrays.copyOf(a,m);

            System.out.println();
            System.out.println("Length= "+array1.length);
            System.out.println("Array after remove: ");

            for(int i = 0; i < array1.length; i++) {
                System.out.print(array1[i] + "\t");
            }

            System.out.println();
        }
    }