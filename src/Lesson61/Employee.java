package Lesson61;

public abstract class Employee {
    private String name;
    private int age;
    private String identificationNumber;

    public Employee() {
    }

    public Employee(String name, int age, String identificationNumber) {
        this.name = name;
        this.age = age;
        this.identificationNumber = identificationNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    abstract long getMealAllowance();
    abstract double getSalaryRate();
    abstract int getWorkingCount();
    public double calculateSalary(){

        return getWorkingCount() * getSalaryRate() + getMealAllowance();
    }
    

}

