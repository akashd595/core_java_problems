package com.core_java_problems;

import java.util.Scanner;

public class SwapingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = sc.nextInt();
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Enter 1st number"+num1);
        System.out.println("Enter 2nd number"+num2);

    }
}
