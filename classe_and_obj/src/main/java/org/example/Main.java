package org.example;

public class Main {

    public static void main(String[] args) {
        var employee = new Employee(
                50_000, 20);
    var employee2 = new Employee(
                50_000, 20);
        employee.calculateWage(0);
        int wage = employee.calculateWage(10);
        System.out.println("Employees Wage is "+wage);
        Employee.printNumberOfEmployees();
//        var browser = new Browser();
//        browser.navigate("");
    }
}