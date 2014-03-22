package cit260.team11.memory.build;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author geojson
 */
import cit260.team11.memory.interfaces.DisplayInfo;
import cit260.team11.memory.interfaces.EnterInfo;
import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

public class Board implements Serializable, EnterInfo, DisplayInfo { 
    private Scanner in = new Scanner(System.in);
    private int columnCount = 4;
    private int rowCount = 4;
    private int boardSize;
    //public Location[][] boardLocations;
    //private int[] symbols;
    private Card[][] board;
    private int [][] shuffleBoard;
    
 public Board() {
     getInput();
     createCards();
     nameCards();
    }
    
 public void getInput() {
     System.out.println("Please enter the number of rows you would like, " +
"between 1 and 8.");
        setRowCount(getIn().nextInt());
        while(getRowCount()<0 || getRowCount()>8){
            System.out.println("Please input a number 1-8");
            setRowCount(getIn().nextInt());
        }
      System.out.println("Please enter the number of columns you would like, "
              + "between 1 and 7.");
        setColumnCount(getIn().nextInt());
     while(getColumnCount()<0 || getColumnCount()>7){
        System.out.println("Please enter a number between 1 and 8");
            setColumnCount(getIn().nextInt());
     }
         
     
     
        setBoardSize(getColumnCount() * getRowCount());
        if(getBoardSize()%2==1){
            setColumnCount(getColumnCount() + 1) ;
            setBoardSize(getColumnCount() * getRowCount());
            System.out.println(" \n \t To ensure an even number of cards so that"
                    + "all cards have matches, the board size has been increased"
                    + "to " + getBoardSize() + "cards"); 
        }
        else {
            System.out.println("\n The board has " + getBoardSize() + " cards."); 
        }
        
        setBoard(new Card[getRowCount()][getColumnCount()]);
        }
       

 public void display() {
     System.out.println("Here is your board!:");
     for(int t=0; t<getRowCount(); t++){
        for(int i=0; i<getColumnCount(); i++) {
            if (getBoard()[t][i].isMatched()){
                System.out.print(getBoard()[t][i].getName() + "-" + getBoard()[t][i].getOwner());
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
        int size=getRowCount()*getColumnCount();
        int[] cards = new int[size];
        int pairs = size/2;
        
        setShuffleBoard(new int[getRowCount()][getColumnCount()]);

        
        int currentSymbol = 0;
        int arrayIndex;
        //there are two i++ because we fill i+1 during the loop
        for(int i=0; i<size; i++){
            cards[i]=currentSymbol;
            cards[i+1]=currentSymbol;
            i++;            
            currentSymbol++;
        }
    
        for(int i = 0; i<getRowCount(); i++){
            for(int j = 0; j<getColumnCount(); j++){
                boolean placed = false;
                while(! placed){
                    
                    arrayIndex = new Random().nextInt(size);
                    if (cards[arrayIndex]>=0){
                        getShuffleBoard()[i][j] = cards[arrayIndex];
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
         for(int t=0; t<getRowCount(); t++){
           for(int i=0; i<getColumnCount(); i++) {
              int cardIndex=getShuffleBoard()[t][i];
             Card thisCard = new Card(symbols [cardIndex]);
             thisCard.setRow(t);
             thisCard.setCol(i);
                getBoard()[t][i] = thisCard;
            }
        }
        
    }
    public Card getCard(int row, int column){
    return getBoard()[row][column];
    }

    /**
     * @return the in
     */
    public Scanner getIn() {
        return in;
    }

    /**
     * @param in the in to set
     */
    public void setIn(Scanner in) {
        this.in = in;
    }

    /**
     * @return the columnCount
     */
    public int getColumnCount() {
        return columnCount;
    }

    /**
     * @param columnCount the columnCount to set
     */
    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    /**
     * @return the rowCount
     */
    public int getRowCount() {
        return rowCount;
    }

    /**
     * @param rowCount the rowCount to set
     */
    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    /**
     * @return the boardSize
     */
    public int getBoardSize() {
        return boardSize;
    }

    /**
     * @param boardSize the boardSize to set
     */
    public void setBoardSize(int boardSize) {
        this.boardSize = boardSize;
    }

    /**
     * @return the board
     */
    public Card[][] getBoard() {
        return board;
    }

    /**
     * @param board the board to set
     */
    public void setBoard(Card[][] board) {
        this.board = board;
    }

    /**
     * @return the shuffleBoard
     */
    public int[][] getShuffleBoard() {
        return shuffleBoard;
    }

    /**
     * @param shuffleBoard the shuffleBoard to set
     */
    public void setShuffleBoard(int[][] shuffleBoard) {
        this.shuffleBoard = shuffleBoard;
    }

    @Override
    public Object getInput(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
