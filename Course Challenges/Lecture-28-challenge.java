package com.company;

import java.sql.SQLOutput;

public class Main {

   public static void main(String[] args) {

           int highScorePosition = calculateHighScorePosition(1500);
           displayHighScorePosition("Tim", highScorePosition);

           highScorePosition = calculateHighScorePosition(900);
           displayHighScorePosition("Bob", highScorePosition);

           highScorePosition = calculateHighScorePosition(400);
           displayHighScorePosition("Percy", highScorePosition);

           highScorePosition = calculateHighScorePosition(50);
           displayHighScorePosition("Gilbert", highScorePosition);

           highScorePosition = calculateHighScorePosition(1000);
           displayHighScorePosition("David", highScorePosition);

           highScorePosition = calculateHighScorePosition(500);
           displayHighScorePosition("Peter", highScorePosition);

           highScorePosition = calculateHighScorePosition(100);
           displayHighScorePosition("Andy", highScorePosition);
       }

       public static void displayHighScorePosition (String playerName,int highSchoolPosition){
           System.out.println(playerName + " managed to get into position " + highSchoolPosition + " on the high score table");
       }

       public static int calculateHighScorePosition ( int playerScore) {
           if (playerScore >= 1000) {
               return 1;
           } else if (playerScore >= 500) {
               return 2;
           } else if (playerScore >= 100) {
               return 3;
           }
           return 4;

          int position = 4;

          if (playerScore >= 1000) {
              position = 1;
          } else if (playerScore >= 500) {
               position = 2;
          } else if (playerScore >= 100) {
               position = 3;
          }

          return position;

       }
}


