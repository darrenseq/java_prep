package org.example;

import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
//        int temp = 12;
//        boolean isWarm = temp > 20 && temp < 30;
//        System.out.println(isWarm);
//        boolean hasHighIncome = true;
//        boolean hasGoodCredit = true;
//        boolean hasCriminalRecord = false;
//        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
//        System.out.println(isEligible);

//        Break and continue
//        while(true){
//            System.out.println("Input: ");
//            input = scanner.next().toLowerCase();
//            if(input.equals("pass"))
////                moves control to beginning of the loop
//                continue;
//            if(input.equals("quit"))
////                break takes control out of the loop
//                break;
//            System.out.println(input);
//        }
//
//        Foreach
        String[] fruits = {"Apple", "Mango", "Orange"};

        for (String fruit: fruits) {
            System.out.println(fruit);
        }
//        String role = "admin";
//        switch (role) {
//            case "admin":
//                System.out.println("You are an Admin");
//                break;
//            case "moderator":
//                System.out.println("You are a moderator");
//                break;
//            default:
//                System.out.println("You are a guest");
//        }
    }
}
