package Lesson61;

public class FulltimeEmployee extends Employee {
   final long MEAL_ALLOWANCE= 2000000;
   private int totalWorkingDays;
   private long dailySalary;

   public FulltimeEmployee() {
   }

   public FulltimeEmployee(String name, int age, String identificationNumber, int totalWorkingDays, long dailySalary) {
      super(name, age, identificationNumber);
      this.totalWorkingDays = totalWorkingDays;
      this.dailySalary = dailySalary;
   }

   public int getTotalWorkingDays() {
      return totalWorkingDays;
   }

   public long getDailySalary() {
      return dailySalary;
   }

   public void setTotalWorkingDays(int totalWorkingDays) {
      this.totalWorkingDays = totalWorkingDays;
   }

   public void setDailySalary(long dailySalary) {
      this.dailySalary = dailySalary;
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


