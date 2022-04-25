package org.example;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    final static byte MONTHS_IN_YEARS = 12;
    final static byte PERCENT = 100;
    public static void main(String[] args) {
        int principal = (int)readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest  = (float) readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte)readNumber("Period (Years): ", 1, 30);

        printMortgage(principal, annualInterest, years);
        printPaymentSchedule(principal, annualInterest, years);
    }

    private static void printMortgage(int principal, float annualInterest, byte years) {
        double mortgage = calculateMortage(principal, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("\nMortgage: " + mortgageFormatted);
    }

    private static void printPaymentSchedule(int principal, float annualInterest, byte years) {
        System.out.println("Payment Schedule");
        for (short month =1; month <= years * MONTHS_IN_YEARS; month++) {
            double balance = calculateBalance(principal, annualInterest, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    public static double readNumber(
            String prompt,
            double min,
            double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between "+min+" and "+max);
        }
        return value;
    }
    public static double calculateMortage(
            int principal,
            float annualInterest,
            byte years) {
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEARS;
        short numberOfPayments = (short)(years * MONTHS_IN_YEARS);

        double power = Math.pow((1 + monthlyInterest), numberOfPayments);
        double mortgage = principal * (monthlyInterest * power) / ( power - 1);

        return mortgage;
    }
    public static double calculateBalance(
            int principal,
            float annualInterest,
            byte years,
            short numberOfPaymentsMade
    ) {
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEARS;
        short numberOfPayments = (short)(years * MONTHS_IN_YEARS);

        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;
    }
}
