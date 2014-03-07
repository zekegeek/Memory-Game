/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

import java.util.Scanner;


public class Game {
    Board board;
   
    public Object newGame() {
        //String message = object.toString();
        System.out.println("\t-------------------------------------------------------------------------------");
        System.out.println("\tNew Game: ");
        System.out.println("\t-------------------------------------------------------------------------------");
        board = new Board();
        takeTurns();
        return null;
   
    }
    
    
    boolean match;
    Card card1;
    Card card2;
    int currentPlayer; 
    int player1 = 1; 
    int player2 = 2;
    byte score1=0;
    byte score2=0;
    
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
    
    public void takeTurns(){
        
        int totalScore=score1+score2;
        currentPlayer = player1;
        int currentScore = score1;
        
        while (totalScore<(board.boardSize/2)){
            System.out.println(currentPlayer+"'s Turn");
            board.displayBoard();
            card1 = selectCard();
            System.out.println("this card is: " + card1.name);
            card2 = selectCard();
            System.out.println("this card is: " + card2.name);
            match = checkMatch(card1, card2);
            if (match==true){
                currentScore++;
                System.out.println("Congratulations, you found a match! Your current score is: " + currentScore);
            }
            //else switch players
            else{
                if(currentPlayer==player1){
                    currentPlayer=player2;
                    currentScore=score2;
                }
                else
                    currentPlayer=player1;
                    currentScore=score1;
            }
        }
        
        if(score1>score2){
            System.out.println(
                    "\n\t*******************************************************************************"
                    + "\n\t\tGame Over.\nPlayer1 Wins!"
                    + "\n\t*******************************************************************************");
        }
        else if(score1<score2){
            System.out.println(
                    "\n\t*******************************************************************************"
                    +"Game Over.\nPlayer2 Wins!"
                    +"\n\t*******************************************************************************");            
        }
        else{
            System.out.println(
                    "\n\t*******************************************************************************"
                    +"Game Over.\nIt's a Tie!"
                    +"\n\t*******************************************************************************");            
        }
        Game game = new Game();
        GamePreferenceView gamePreferenceMenu = new GamePreferenceView(game);
        gamePreferenceMenu.getInput();
    }
    
    /*
    }ORIGINAL CODE
    public void takeTurns(){
        int totalScore=(score1+score2);
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
            currentPlayer = player2;
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
        }*/

 private Card selectCard(){
        
      
        int row;
        int column;
        Card card = null;
                
        Scanner input = new Scanner(System.in);
        boolean validCard = false;
        
        while (validCard==false)
        {
        System.out.println("Enter a row number for the card:");
        row = input.nextInt();
        while (row < 0 || row > board.rowCount){
          System.out.println("That is not a valid number."
                  + "\nPlease enter a value between 0 and "+board.rowCount);
        }
        
        System.out.println("Enter a column number for the card:");
        column = input.nextInt();
        while (column < 0 || column > board.columnCount){
          System.out.println("That is not a valid number."
                  + "\nPlease enter a value between 1 and "+board.columnCount);
        }
      
       card = board.getCard(row, column);
        
        if(card.matched)
        {
            System.out.println("That card has already been chosen"
                  + "\nPlease try a different card");
            break;
        }
        else validCard = true;
        }// end while
        return card;
               
    }

        
    
        

        private boolean checkMatch(Card card1, Card card2){
       
        if (card1.name.equals(card2.name))
        {
            card1.matched = true;
            card1.owner = currentPlayer;
            
            card2.matched = true;
            card2.owner = currentPlayer;
            
            return true;
        }
       else
            return false;
    }
        
}