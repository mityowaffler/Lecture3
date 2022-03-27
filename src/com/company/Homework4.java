package com.company;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("The game begins!");
        int countWins=0;
        int countLoses=0;

        while(true) {

            System.out.print("Enter 'rock', 'paper', or 'scissors' for a move or 'quit' to quit the game. \nWhat is your move? \n");
            String myMove = in.nextLine();

            if(myMove.equals("quit")) {
                break;
            }

            if(!myMove.equals("rock") && !myMove.equals("paper") && !myMove.equals("scissors")) {

                System.out.println("Your move isn't valid!");

            } else {

                int rand = (int)(Math.random()*3);

                String opponentMove = "";
                if(rand == 0) {
                    opponentMove = "rock";
                } else if(rand == 1) {
                    opponentMove = "paper";
                } else {
                    opponentMove = "scissors";
                }
                System.out.println("Opponent move: " + opponentMove + "\n");

                if(myMove.equals(opponentMove)) {
                    System.out.println("It's a tie!");
                } else if((myMove.equals("rock") && opponentMove.equals("scissors")) || (myMove.equals("scissors") && opponentMove.equals("paper")) || (myMove.equals("paper") && opponentMove.equals("rock"))) {
                    System.out.println("You won!");
                    countWins++;
                } else {
                    System.out.println("You lost!");
                    countLoses++;
                }

                System.out.println("Result:\n Player: " + countWins + " | " + "Computer: " + countLoses);
                if (countWins == countLoses) {
                    System.out.println(" Good pace, keep going, it's even!\n");
                } else if (countWins > countLoses) {
                    System.out.println(" Great moves! The computer loses badly!\n");
                } else {
                    System.out.println(" Hurry up! You are losing!\n");
                }
            }


        }

        System.out.println("Thanks for playing Rock, Paper, Scissors!");

    }
}