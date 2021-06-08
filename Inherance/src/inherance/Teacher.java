package inherance;

public class Teacher extends Person {

    public int Salary;

    public Teacher(int Salary, String name, int age, String address) {
        super(name, age, address);
        this.Salary = Salary;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        this.Salary = Salary;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Salary: " + Salary);
    }
}

