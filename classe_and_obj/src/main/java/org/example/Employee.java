package org.example;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    private static int numberOfEmployees;

    public Employee(int baseSalary) {
        this(baseSalary, 0);
    }
    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }
    public static void printNumberOfEmployees() {
        System.out.println("Number of employees "+ numberOfEmployees);
    }
    private void setHourlyRate(int hourlyRate) {
        if(hourlyRate<0)
            throw new IllegalArgumentException("Hourly Rate cannot be 0 or less!");
        this.hourlyRate = hourlyRate;
    }
    private int getHourlyRate() {
        return this.hourlyRate;
    }
    public int calculateWage (int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }
    private void setBaseSalary(int baseSalary) {
        if(baseSalary < 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less!");
        this.baseSalary = baseSalary;
    }
    private int getBaseSalary() {
        return this.baseSalary;
    }
}
