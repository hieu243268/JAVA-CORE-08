package lesson51;
import java.util.Scanner;
public class StudentManagement {
    public int n;
    public Student students[];

    public StudentManagement(int n) {
        this.n = n;
        students = new Student[n];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.println("Thông tin sinh viên thứ " + (i + 1) + ":");
            System.out.println("\tTên: ");
            String name = sc.nextLine();
            System.out.println("\tGPA: ");
            double gpa = sc.nextDouble();
            sc.nextLine();
            students[i] = new Student(name, gpa);
        }
    }

    public int count(boolean check) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (check) {
                count = count + (students[i].Check() ? 1 : 0);
            } else {
                count = count + (students[i].Check() ? 0 : 1);
            }
        }
        return count;
    }

    public Student Max(){
        if(n<1){
            return null;
        }
        Student max = students[0];
        for (int i = 1; i < n; i++) {
        if (students[i].getGpa() > max.getGpa()) {
            max = students[i];
        }
    }
        return max;
}

    public Student Min() {
        if (n < 1) {
            return null;
        }
        Student min = students[0];
        for (int i = 1; i < n; i++) {
            if ((students[i].getGpa() < min.getGpa())) {
                min = students[i];
            }
        }
        return min;
    }

}



