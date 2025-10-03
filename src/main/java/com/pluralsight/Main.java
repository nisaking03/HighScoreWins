package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Creating a scanner so user input can but used as data
        Scanner sc = new Scanner(System.in);

        // Creating my first variables to split the teams and score into halves
        String gameScore;
        String teams;
        String scores;

        // Prompting the user to type in the info I need
        System.out.print("Please enter the game score (Home:Visitor|0:0): ");
        gameScore = sc.nextLine(); //Using scanner to hold user input data

        //Splitting everything in half from "|"
        String[] splitString = gameScore.split("\\|");

        //Splitting the first half which is the team names from ":"
        teams = splitString[0];
        String[] teamSplit = teams.split(":");
        //Defining what the first and second names are into variables
        String team1 = teamSplit[0];
        String team2 = teamSplit[1];

        //Splitting the first half which is the team scores from ":"
        scores = splitString[1];
        String[] scoreSplit = scores.split(":");
        //Defining what the first and second scores are into variables
        int score1 = Integer.parseInt(scoreSplit[0]);
        int score2 = Integer.parseInt(scoreSplit[1]);


        if (score1 > score2) {
            System.out.println(team1 + " Wins!");
        }
        else if (score1 < score2) {
            System.out.println(team2 + " Wins!");
        }
        else {
            System.out.println(team1 + " and " + team2 + " had a tie!");
        }
    }
}