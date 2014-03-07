/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

import java.io.Serializable;
import java.util.Scanner;


public class Game implements Serializable{
    Board board;
    
    private boolean match;
    private Card card1;
    private Card card2;
    private int currentPlayer; 
    private int player1 = 1; 
    private int player2 = 2;
    private byte score1=0;
    private byte score2=0;
    
    
    public Game() {
    }

    private Board getBoard() {
        return board;
    }

    private void setBoard(Board board) {
        this.board = board;
    }

    private boolean isMatch() {
        return match;
    }

    private void setMatch(boolean match) {
        this.match = match;
    }

    private Card getCard1() {
        return card1;
    }

    private void setCard1(Card card1) {
        this.card1 = card1;
    }

    private Card getCard2() {
        return card2;
    }

    private void setCard2(Card card2) {
        this.card2 = card2;
    }

    private int getCurrentPlayer() {
        return currentPlayer;
    }

    private void setCurrentPlayer(int currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    private int getPlayer1() {
        return player1;
    }

    private void setPlayer1(int player1) {
        this.player1 = player1;
    }

    private int getPlayer2() {
        return player2;
    }

    private void setPlayer2(int player2) {
        this.player2 = player2;
    }

    private byte getScore1() {
        return score1;
    }

    private void setScore1(byte score1) {
        this.score1 = score1;
    }

    private byte getScore2() {
        return score2;
    }

    private void setScore2(byte score2) {
        this.score2 = score2;
    }
    
    
   
    public Object newGame() {
        //String message = object.toString();
        System.out.println("\t-------------------------------------------------------------------------------");
        System.out.println("\tNew Game: ");
        System.out.println("\t-------------------------------------------------------------------------------");
        board = new Board();
        takeTurns();
        return null;
   
    }    
    
    
    private void takeTurns(){
        
        int totalScore=getScore1()+getScore2();
        setCurrentPlayer(getPlayer1());
        int currentScore = getScore1();
        
        while (totalScore<(board.getBoardSize()/2)){
            System.out.println(getCurrentPlayer()+"'s Turn");
            board.displayBoard();
            card1 = selectCard();
            System.out.println("this card is: " + card1.getName());
            card2 = selectCard();
            System.out.println("this card is: " + card2.getName());
            match = checkMatch(card1, card2);
            if (match==true){
                currentScore++;
                System.out.println("Congratulations, you found a match! Your current score is: " + currentScore);
            }
            //else switch players
            else{
                if(getCurrentPlayer()==getPlayer1()){
                    setCurrentPlayer(getPlayer2());
                    currentScore=getScore2();
                }
                else
                    setCurrentPlayer(getPlayer1());
                    currentScore=getScore1();
            }
        }
        
        if(getScore1()>getScore2()){
            System.out.println(
                    "\n\t*******************************************************************************"
                    + "\n\t\tGame Over.\nPlayer1 Wins!"
                    + "\n\t*******************************************************************************");
        }
        else if(getScore1()<getScore2()){
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
        while (row < 0 || row > (board.getRowCount() -1)){
          System.out.println("That is not a valid number."
                  + "\nPlease enter a value between 0 and "+ (board.getRowCount() -1));
        }
        
        System.out.println("Enter a column number for the card:");
        column = input.nextInt();
        while (column < 0 || column > (board.getColumnCount() -1)){
          System.out.println("That is not a valid number."
                  + "\nPlease enter a value between 1 and "+(board.getColumnCount() -1));
        }
      
       card = board.getCard(row, column);
        
        if(card.isMatched())
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
       
        if (card1.getName().equals(card2.getName()))
        {
            card1.setMatched(true);
            card1.setOwner(getCurrentPlayer());
            
            card2.setMatched(true);
            card2.setOwner(getCurrentPlayer());
            
            return true;
        }
       else
            return false;
    }
        
}
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
