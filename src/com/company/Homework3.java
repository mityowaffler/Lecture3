package com.company;

import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to display Fibonacci Series of:");
        int input = sc.nextInt();

        sc.close();

        int num1 = 0, num2 = 1;

        for (int i = 1; i <= input; ++i){

            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            System.out.print(num1+" ");
        }
    }
}
