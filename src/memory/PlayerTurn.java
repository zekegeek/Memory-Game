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
        
    public int turn(){
         
        showCards();
        checkMatch();
        //if checkMatch(true){
        //run removeCards function
        //count numOfMathes
        //player gets another turn}
        
        return numOfMatches;
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
    private void checkMatch(){
        //check for a match
        //return true or false
    }
    private void removeCards(){
        //remove the two selected cards
    }
}
