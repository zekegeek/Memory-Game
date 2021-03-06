/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit260.team11.memory.build;

import cit260.team11.memory.enums.Error;
import cit260.team11.memory.exceptions.GameException;
import cit260.team11.memory.interfaces.DisplayInfo;
import cit260.team11.memory.frames.BoardFrame;
import java.util.Scanner;


public class Game {
    Board board;
    
    private boolean match;
    private boolean retryTurn = false;
    private Card card1;
    private Card card2;
    private int currentPlayer; 
    private int player1 = 1; 
    private int player2 = 2;
    private byte score1=0;
    private byte score2=0;
    private BoardFrame gameBoard;
    
    public Game() {
        board = new Board();
    }
    
    public Game(int row, int column) {
        gameBoard = new BoardFrame();
        board = new Board(row, column);
    }

    public void startGame() {
        gameBoard.setVisible(true);
        board.display(gameBoard);
        //BoardFrame boardFrame = new BoardFrame();
        //boardFrame.setVisible(true);
    }
    
    public void processTurn() {
        //get row1,col1, ro2, col2, convert to ints
        //getboard, getcards, feed row & column
        //take error checking from selectCard
        /*
        use board to get actual cards back (check for valid cards, check if matched)
        print error message to messageArea if not valid
        if valid, display cards on board, if match then increase score and give player another turn.
        if not match, switch player. 
        */
        int card1r = Integer.parseInt(gameBoard.card1row.getText());
        int card1c = Integer.parseInt(gameBoard.card1column.getText());
        int card2r = Integer.parseInt(gameBoard.card2row.getText());
        int card2c = Integer.parseInt(gameBoard.card2column.getText());
    }
    
    public Board getBoard() {
        return board;
    }

    private void setBoard(Board board) {
        this.board = board;
    }

    /*private boolean isMatch() {
      return match;
    }

    private void setMatch(boolean match) {
        this.match = match;
    }*/

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

    public int getCurrentPlayer() {
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

    public byte getScore1() {
        return score1;
    }

    private void setScore1(byte score1) {
        this.score1 = score1;
    }

    public byte getScore2() {
        return score2;
    }

    private void setScore2(byte score2) {
        this.score2 = score2;
    }
    
    
   
   /* @Override
    public void display() {
        board = new Board();
        takeTurns();   
    }  */  
        

    public void displayError(){
        System.out.println("Invalid Input:");
    }
    
    private void takeTurns(){
        
        int totalScore=getScore1()+getScore2();
        setCurrentPlayer(getPlayer1());
        int currentScore = getScore1();
        Scanner inFile = new Scanner(System.in);
        do{
            System.out.println(getCurrentPlayer()+"'s Turn");
            board.display();
            try{
                card1 = selectCard();
                System.out.println("this card is: " + card1.getName());
                card2 = selectCard();
                System.out.println("this card is: " + card2.getName());
                match = checkMatch(card1, card2);
            }
            catch(GameException e){
                System.out.println(e.getMessage());
                System.out.println("Please try your turn again");
                continue;
            }
            
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
        while (totalScore!=(board.getBoardSize()/2));
        
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
        /*Game game = new Game();
        GamePreferenceView gamePreferenceMenu = new GamePreferenceView(game);
        gamePreferenceMenu.getInput();*/
    }
    
    
 protected Card selectCard() throws GameException {
        
      
        int row;
        int column;
        Card card = null;
                
        Scanner input = new Scanner(System.in);
        boolean validCard = false;
        
        if (validCard==false)
        {
            System.out.println("Enter a row number for the card:");
            row = input.nextInt();
            if (row < 0 || row > (board.getRowCount() -1)){
                throw new GameException(Error.ERROR102.getMessage());
                /*displayError();
                System.out.println("Please enter a value between 0 and "+ (board.getRowCount() -1));*/
            }
            
            System.out.println("Enter a column number for the card:");
            column = input.nextInt();
            if (column < 0 || column > (board.getColumnCount() -1)){
                throw new GameException(Error.ERROR102.getMessage());
                /*displayError();
                System.out.println("Please enter a value between 1 and "+(board.getColumnCount() -1));*/
            }
            
            card = board.getCard(row, column);
            
            if(card.isMatched())
            {
                throw new GameException(Error.ERROR107.getMessage());
                /*System.out.println("That card has already been chosen"
                        + "\nPlease try a different card");*/
                //break;
            }
            else validCard = true;
        }// end while
        return card;
               
    }        

        private boolean checkMatch(Card card1, Card card2)throws GameException{
            if (card1.getRow() == card2.getRow() && card1.getCol() == card2.getCol())
            {
                throw new GameException(Error.ERROR108.getMessage());
            }
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
