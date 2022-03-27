package com.company;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("chisloto e:");
        int h = sc.nextInt();
        int res = 1;

        for (int i=1; i<=h ; i++) {

            res *= i;

        }
        System.out.println("Factorial is: " + res);


    }
}
