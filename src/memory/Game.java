/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

import java.util.Scanner;

/**
 *
 * @author Cook
 */
public class Game {
    Board board;
   
    public Object newGame(Object object) {
        String message = (String) object;
        System.out.println("\t-------------------------------------------------------------------------------");
        System.out.println("\tNew Game: " + message);
        System.out.println("\t-------------------------------------------------------------------------------");
        return null;
   
    }
    
    
    boolean match;
    char card1;
    char card2;
    char currentPlayer, player1, player2;
    
    /*
    I think the main part of the game will be inside another loop. Something
    like: while (! winnerFound) { ... } then when you find the winner, set that 
    boolean to true and you'll exit the loop. Then just print out the winner and
    it will be done.
    */
    
    /*
    One way you could approach the two loops would be to have another temporary 
    variable that holds the current player. At the beginning, currentPlayer = player1. 
    If current player makes a match, then don't change the player. Otherwise, 
    set currentPlayer to player2. Then just loop over that until there's no more cards.
    */
    
    public void takeTurns2(){
        byte score1=0;
        byte score2=0;
        int totalScore=score1+score2;
        currentPlayer = player1;
        
        
        
    }
    public void takeTurns(){
        byte score1=0;
        byte score2=0;
        int totalScore=(int)((int)score1+score2);
        //this might have to turn into a switch statment in order to give the 
        //player another turn.
        while (totalScore<18){
            System.out.println("Player1's Turn");
            card1 = selectCard();
            card2 = selectCard();
            match = checkMatch();
            if (match==true){
                score1++;
                if (totalScore==18){
                    break;
                }
                //else{give player1 another turn
                //start from the println}
            }
            System.out.println("Player2's Turn");
            card1 = selectCard();
            card2 = selectCard();
            match = checkMatch();
            if (match==true){
                score1++;
                if (totalScore==18){
                    break;
                }
                //else{give player2 another turn
                //start from the println}
            }    
        }
        if(score1>score2){
            System.out.println("Game Over.\nPlayer1 Wins!");
            //two buttons: Play Again, Main Menu
        }
        else if(score1<score2){
            System.out.println("Game Over.\nPlayer2 Wins!");
            //two buttons: Play Again, Main Menu
        }
        else{
            System.out.println("Game Over.\nIt's a Tie!");
            //two buttons: Play Again, Main Menu
        }
    }
    
    /*
    Another approach would be to hold the cards in a 2d array. That would look 
    something like Card[][] cards. Then you could access a particular Card by 
    saying cards[row][column] where row and column are ints. It would mean you'd 
    need to convert the horizontal char into an int, but going this way might be 
    easier than creating a composite index of vertical+horizontal.
    */
    private char selectCard(){
        
        char[] validValues = {'A', 'B', 'C','D', 'E', 'F', 'a', 'b', 'c', 'd', 'e', 'f'};
        byte vertical=3;
        char horizontal='A';
        
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
    
    public void createCard(){
        
    }

}
