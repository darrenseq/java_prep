package org.example;

import java.text.NumberFormat;

public class MortgageReport {
    private MortgageCalculatorImp calculator;
    private final NumberFormat currency;

    public MortgageReport(MortgageCalculatorImp calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    public void printPaymentSchedule() {
        System.out.println("Payment Schedule");
        for (double balance: calculator.getRemainingBalances()) {
            System.out.println(currency.format(balance));
        }
    }
    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("\nMortgage: " + mortgageFormatted);
    }
}
