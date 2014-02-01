/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

import java.util.Scanner;

/**
 *
 * @author Charlotte Cook
 */
public class PlayerTurn {
    int numOfMatches = 0;
    String card1;
    String card2;
    
    public void takeTurns(){
        byte score1=0;
        byte score2=0;
        int totalScore=score1+score2;
        while (totalScore<18){
            
        }
    
    
    
    }
        
    public boolean checkMatch(){
         
        showCards();
        checkMatch();
        //if checkMatch(true){
        //run removeCards function
        return true;
    }
    public void getCards(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the card's location: ");
        this.card1 = input.next();
        
        System.out.println("Enter the second card's location: ");
        this.card2 = input.next();
    }
    private void showCards(){
        //retrieve cards from createBoard
        //reveal/return cards
    }
    
    private void removeCards(){
        //remove the two selected cards
    }
}
