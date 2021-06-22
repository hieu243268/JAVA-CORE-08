package Lesson61;

public class ParttimeEmployee extends Employee {
    final int MEAL_ALLOWANCE=0;
    private int totalWorkingShilft;
    private long baseSalary;

    public ParttimeEmployee() {
    }

    public ParttimeEmployee(String name, int age, String identificationNumber, int totalWorkingShilft, long baseSalary) {
        super(name, age, identificationNumber);
        this.totalWorkingShilft = totalWorkingShilft;
        this.baseSalary = baseSalary;
    }


    public int getTotalWorkingShilft() {
        return totalWorkingShilft;
    }

    public void setTotalWorkingShilft(int totalWorkingShilft) {
        this.totalWorkingShilft = totalWorkingShilft;
    }

    public long getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(long baseSalary) {
        this.baseSalary = baseSalary;
    }
    @Override
    long getMealAllowance() {

        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    double getSalaryRate() {

        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    int getWorkingCount() {

        throw new UnsupportedOperationException("Not supported yet.");
    }
}
