package org.example;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEARS = 12;
        final byte PERCENT = 100;
        int principal = 0;
        float annualInterest  = 0;
        byte years = 0;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Principal: ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a value between 1,000 & 1,000,000");
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            annualInterest = scanner.nextFloat();
            if (annualInterest >= 1 && annualInterest <= 30)
                break;
            System.out.println("Enter a value between 1 and 30");
        }
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEARS;

        while (true) {
            System.out.print("Period (Years): ");
            years = scanner.nextByte();
            if (years >= 1 && years <= 30)
                break;
            System.out.println("Enter year between 1 and 30");
        }
        int numberOfPayments = years * MONTHS_IN_YEARS;

        double power = Math.pow((1 + monthlyInterest), numberOfPayments);
        double mortgage = principal * (monthlyInterest * power) / ( power - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
