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
    private String[][] board;
    
 public Board() {
     createBoard();
     createCards();
     nameCards();
    }
    
 public void createBoard() {
      System.out.println("Please enter the number of columns you would like, "
              + "between 1 and 12.");
     columnCount= in.nextInt();
     if(columnCount<0 && columnCount>12){
        System.out.println("Please input a number 1-12");
        columnCount= in.nextInt();
        System.out.println("\"Please enter the number of rows you would like, " +
"              + \"between 1 and 12.\"");
        rowCount= in.nextInt();
        if(rowCount<0 && rowCount>13){
            System.out.println("Please input a number 1-12");
            rowCount= in.nextInt();
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
            System.out.println("\n The board has " + boardSize + "cards."); 
        }
        
        }
       
}
 public void displayBoard() {
     System.out.println("Here is your board!:");
     for(int t=0; t<rowCount; t++){
        for(int i=0; i<columnCount; i++) {
            System.out.print("x\t");
        }
        System.out.print("\n\n");
     }
 }
 
 
    public void createCards(){
        //assigning just numbers for the card faces for now
        //int cards[][] = new int [rowCount][columnCount];
        //int cards[]=new int[size];
        int size=rowCount*columnCount;
        int[] cards = {0,0,1,1,2,2,3,3,4,4,5,5,6,6,7,7};
        int pairs = size/2;
        
        /*
        String face[] = new String[18];
        String[] face = { 'cat', 'dog', 'cow', 'moose', 'donkey', 'horse', 'deer',
        'elk', 'mouse', 'mule', 'chicken', 'turkey', 'emu', 'ostrich',  'worm',
        'snail', 'penguin', 'dragon', 'pig' };
        */
        
        int currentSymbol = 0;
        int arrayIndex;
        //there are two i++ because we fill i+1 during the loop
        for(int i=0; i<pairs; i++){
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
                    if (cards[arrayIndex]>0){
                        board[i][j] = Integer.toString(cards[arrayIndex]);
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
         int cardsums = 0;
         for (String [] row : board){
             for(String card: row){
                 int cardIndex=Integer.parseInt(card);
                 card= symbols [cardIndex];
                 cardsums+= cardIndex;
            }
        }
    }
}
