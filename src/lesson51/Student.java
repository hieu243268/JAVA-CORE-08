package lesson51;

public class Student {
    public int name;
    public double gpa;

    public Student(String name, double gpa) {
    }

    public Student(int name, double gpa) {
        this.name = name;
        this.gpa=gpa;
    }

    public int getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(int name) {
        this.name = name;

    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public boolean Check(){
        return gpa>=1.5;
    }
    public void display(){
        System.out.println("Name: "+ name);
        System.out.println("gpa: "+gpa);
    }
}
