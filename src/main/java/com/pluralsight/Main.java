package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //Ask for input
        System.out.println("Whats the score for each team? (Team1:Team2|Score1:Score2)");
        String gamescore = sc.nextLine();
        sc.nextLine();

        //split the names from the scores
        String[] parts = gamescore.split("\\|");

        String[] teams = parts[0].split(":");
        String[] scores = parts[1].split(":");

        String team1 = teams[0];
        String team2 = teams[1];


        //Compare scores
        int score1;
        int score2;
        //I dont undertand what to do here


        //Print winner
        if (score1 > score2) {
            System.out.println(team1 + "wins!");
        } else if (score1 < score2) {
            System.out.println(team2 + "wins!");
        } else {
            System.out.println("It's a tie!");

        }
    }
}
