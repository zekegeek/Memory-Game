/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

import java.util.Scanner;

/**
 *
 * @author Sony Style
 */
public class Game {
    char card1;
    char card2;
    public void takeTurns(){
        byte score1=0;
        byte score2=0;
        int totalScore=score1+score2;
        while (totalScore<18){
            
        }
    
    
    private char selectCard(){
        
        char[] validValues = {'A', 'B', 'C','D', 'E', 'F', 'a', 'b', 'c', 'd', 'e', 'f'};
        byte vertical=3;
        char horizontal='f';
        
        if (vertical < 1 || vertical > 6){
          System.out.println("That is not a valid number."
                  + "\nPlease enter a value between 1 and 6.");
        }
        else{
            for(int i = 0; i < validValues.length; i++)
            {
                if(validValues[i] != horizontal){ 
                    System.out.println("That is an invalid value."
                            + "\nPlease enter a letter between A and F.");
                }
            }
        }
        char card = (char)((char) vertical+horizontal);
        return card;   
    }
        
    private boolean checkMatch(){
         
        showCards();
        checkMatch();
        //if checkMatch(true){
        //run removeCards function
        return true;
    }
    private void getCards(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the card's location: ");
        //this.card1 = input.next();
        
        System.out.println("Enter the second card's location: ");
        //this.card2 = input.next();
    }
    private void showCards(){
        //retrieve cards from createBoard
        //reveal/return cards
    }
    
    private void removeCards(){
        //remove the two selected cards
    }
}

