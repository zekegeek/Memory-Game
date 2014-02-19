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
import java.util.Scanner;
public class Board {
    Scanner in = new Scanner(System.in);
    public int columnCount = 4;
    public int rowCount = 4;
    //public Location[][] boardLocations;
    
 public Board() {
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
     
     
        int boardSize= columnCount*rowCount;
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
 
 
    public void createCard(String args[]){
        //assigning just numbers for the card faces for now
        int size=rowCount*columnCount;
        int cards[]=new int[size];
        //int cards[][] = new int [rowCount][columnCount];
        //
        int pairs = size/2;
        
        int face[] = new int[18];
        /*
        face[] = { 'cat', 'dog', 'cow', 'moose', 'donkey', 'horse', 'deer',
        'elk', 'mouse', 'mule', 'chicken', 'turkey', 'emu', 'ostrich',  'worm',
        'snail', 'penguin', 'dragon', 'pig' };
        */
        for(int i=0; i<pairs; i++){
            cards[i]=face;
            cards[i+1]=face;
            i++;
            face++;
        }
    
        for(int i = 0; i<rowCount; i++){
            for(int j = 0; j<columnCount; j++){
                cards[i][j] = card;
                card++;
            }
        }
        
        for (int x[] : cards){
            for(int y : x){
                System.out.println("Card "+x+" = "+y);	
            }
        }    
    }
}