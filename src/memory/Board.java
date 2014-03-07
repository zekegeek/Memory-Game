package memory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author geojson
 */
import java.util.Random;
import java.util.Scanner;
public class Board {
    Scanner in = new Scanner(System.in);
    public int columnCount = 4;
    public int rowCount = 4;
    public int boardSize;
    //public Location[][] boardLocations;
    //private int[] symbols;
    private Card[][] board;
    private int [][] shuffleBoard;
    
 public Board() {
     createBoard();
     createCards();
     nameCards();
    }
    
 public void createBoard() {
     System.out.println("Please enter the number of rows you would like, " +
"between 1 and 8.");
        rowCount= in.nextInt();
        while(rowCount<0 || rowCount>8){
            System.out.println("Please input a number 1-8");
            rowCount= in.nextInt();
        }
      System.out.println("Please enter the number of columns you would like, "
              + "between 1 and 7.");
     columnCount= in.nextInt();
     while(columnCount<0 || columnCount>7){
        System.out.println("Please enter a number between 1 and 8");
        columnCount= in.nextInt();
     }
         
     
     
        boardSize= columnCount*rowCount;
        if(boardSize%2==1){
            columnCount++ ;
            boardSize=(columnCount*rowCount);
            System.out.println(" \n \t To ensure an even number of cards so that"
                    + "all cards have matches, the board size has been increased"
                    + "to " + boardSize + "cards"); 
        }
        else {
            System.out.println("\n The board has " + boardSize + " cards."); 
        }
        
        board = new Card [rowCount] [columnCount];
        }
       

 public void displayBoard() {
     System.out.println("Here is your board!:");
     for(int t=0; t<rowCount; t++){
        for(int i=0; i<columnCount; i++) {
            if (board[t][i].isMatched()){
                System.out.print(board[t][i].getName() + "-" + board[t][i].getOwner());
            }
            else System.out.print(t + "-" + i);
            System.out.print("\t");
        }
        System.out.print("\n\n");
     }
 }
 
 
    public void createCards(){
        //assigning just numbers for the card faces for now
        //int cards[][] = new int [rowCount][columnCount];
        //int cards[]=new int[size];
        int size=rowCount*columnCount;
        int[] cards = new int[size];
        int pairs = size/2;
        
        shuffleBoard = new int [rowCount] [columnCount];

        
        int currentSymbol = 0;
        int arrayIndex;
        //there are two i++ because we fill i+1 during the loop
        for(int i=0; i<size; i++){
            cards[i]=currentSymbol;
            cards[i+1]=currentSymbol;
            i++;            
            currentSymbol++;
        }
    
        for(int i = 0; i<rowCount; i++){
            for(int j = 0; j<columnCount; j++){
                boolean placed = false;
                while(! placed){
                    
                    arrayIndex = new Random().nextInt(size);
                    if (cards[arrayIndex]>=0){
                        shuffleBoard[i][j] = cards[arrayIndex];
                        cards[arrayIndex]=-1;
                        placed = true;
                    }
                }
            }
        }      
        //board = new string [rowCount][columnCount]
        /*
        cards[i][j] = card;
        card++;
        for (int x[] : cards{
            for(int y : x){
                System.out.println("Card "+x+" = "+y);	
            }
        }
        */ 
        
       

        }
    public void nameCards() {
         String[] symbols = { "cat", "dog", "cow", "moose", "donkey", "horse", "deer",
        "elk", "mouse", "mule", "chicken", "turkey", "emu", "ostrich",  "worm",
        "snail", "penguin", "dragon", "pig", "bird", "giraffe", "elephant", 
        "fish", "whale", "monkey", "bear", "owl", "snake" };
         for(int t=0; t<rowCount; t++){
           for(int i=0; i<columnCount; i++) {
              int cardIndex=shuffleBoard[t][i];
             Card thisCard = new Card(symbols [cardIndex]);
             thisCard.setRow(t);
             thisCard.setCol(i);
             board[t][i] = thisCard;
            }
        }
        
    }
    public Card getCard(int row, int column){
    return board[row][column];
    }
}
