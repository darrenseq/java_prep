package org.example;

public class ControlFlow {
    public static void main(String[] args) {
//        int temp = 12;
//        boolean isWarm = temp > 20 && temp < 30;
//        System.out.println(isWarm);
//        boolean hasHighIncome = true;
//        boolean hasGoodCredit = true;
//        boolean hasCriminalRecord = false;
//        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
//        System.out.println(isEligible);
        String role = "admin";
        switch (role) {
            case "admin":
                System.out.println("You are an Admin");
                break;
            case "moderator":
                System.out.println("You are a moderator");
                break;
            default:
                System.out.println("You are a guest");
        }
    }
}
