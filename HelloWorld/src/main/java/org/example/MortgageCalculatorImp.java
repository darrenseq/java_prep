package org.example;

public class MortgageCalculatorImp {
    private final static byte MONTHS_IN_YEARS = 12;
    private final static byte PERCENT = 100;

    private int principal;
    private float annualInterest;
    private byte years;

    public MortgageCalculatorImp(int principal, float annualInterest, byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }
    public double calculateMortgage() {
        float monthlyInterest = getMonthlyInterest();
        short numberOfPayments = getNumberOfPayments();

        double power = Math.pow((1 + monthlyInterest), numberOfPayments);
        double mortgage = principal * (monthlyInterest * power) / ( power - 1);

        return mortgage;
    }
    public double calculateBalance(short numberOfPaymentsMade) {
        float monthlyInterest = getMonthlyInterest();
        short numberOfPayments = getNumberOfPayments();

        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;
    }
    public double[] getRemainingBalances() {
        double[] balances = new double[getNumberOfPayments()];
        for (short month = 1; month <= balances.length; month++)
            balances[month - 1] = calculateBalance(month);
        return balances;
    }
    private float getMonthlyInterest() {
        return annualInterest / PERCENT / MONTHS_IN_YEARS;
    }
    private short getNumberOfPayments() {
        return (short) (years * MONTHS_IN_YEARS);
    }
}
