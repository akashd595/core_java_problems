package com.core_java_problems;

import java.util.Scanner;

public class CheckingEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number ");
        int num = sc.nextInt();
        if(num%2 == 0){
            System.out.println("Even number ");
        }
        else {
            System.out.println("Odd number ");
        }
    }
}
