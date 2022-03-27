package com.company;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How much number will you compare:");
        int compare = sc.nextInt();

        int min = 0;
        int max = 0;

        for (int i=0; i<compare; i++) {

            System.out.println("Enter the number #" + (i + 1) + ":");
            int nextNumber = sc.nextInt();

            if ((min == 0) || (min >= nextNumber)) {
                min = nextNumber;
            }
            if ((max == 0) || (max <= nextNumber)) {
                max = nextNumber;
            }
        }
        sc.close();

        System.out.println("Min number is: " +min + "\n" + "Max number is: " +max);
    }
}
