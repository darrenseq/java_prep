package org.example;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        byte age = 30;
//        long viewsCount = 3_123_456_789L;
//        float price = 10.99F;
//        char letter = 'A';
//        boolean isEligible = false;
//        System.out.println(herAge);
//  Reference types
//        byte age = 30;
//        Date now = new Date();
//        System.out.println(now);
// Strings
//        String message = "Hello World" + "!!";
//        System.out.println(message.indexOf('H'));
//        System.out.println(message.replace("H", "+"));
//        System.out.println(message.toLowerCase());
//        System.out.println(message.trim());
//        String message = "Hello \"Darren\"";
//        String message = "Hello \nDarren\tSequeira";
//        System.out.println(message);
// Arrays
//        int[] numbers = new int[5];
//        numbers[0] = 1;
//        numbers[1] = 2;
//        numbers[2] = 3;
//        System.out.println(Arrays.toString(numbers));
//        int[] numbers = {1,2,3,45,54};
//        Arrays.sort(numbers);
//        System.out.println(numbers.length);
//        System.out.println(Arrays.toString(numbers));
// Matrix
//        int[][] numbers = new int[2][3];
//        numbers[0][0] = 1;
//        System.out.println(Arrays.deepToString(numbers));
//        int [][] numbers = {{1,2,3},{4,5,6}};
//        System.out.println(Arrays.deepToString(numbers));
// Constants
//        final float pi = 3.14F;
// Arithmetic/ Type Cast
//        double result = (double) 10 / (double) 3;
//        System.out.println(result);
// Implicit Casting (no chance of data loss)
//        byte > short > int > long > float > double
//        String x = "1";
//        int y = Integer.parseInt(x) + 2;
//        System.out.println(y);
//        short x = 1;
// Format numbers
//        NumberFormat percent = NumberFormat.getPercentInstance();
//        String result = percent.format(12345.9802);
//
//        result = NumberFormat.getPercentInstance().format(212.11312);
//        System.out.println(result);
// Taking Input
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your age");
//        byte age = scanner.nextByte();
//        System.out.println("You are "+age+" years old!");

//        System.out.print("First Name: ");
//        String fName = scanner.next();
//        System.out.println("Your name is "+fName);
        System.out.print("Full Name: ");
        String name = scanner.nextLine().trim();
        System.out.println("Your name is "+name);
    }
}