/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit260.team11.memory.build;

import java.util.Random;

/**
 *
 * @author Sony Style
 */
public class SubCard extends SuperCard {
  @Override
    public void createCards(){
        int size=rowCount*columnCount;
        int[] cards = new int[size];
        int pairs = size/2;
        
        setShuffleBoard(new int[rowCount][columnCount]);

        
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
                        getShuffleBoard()[i][j] = cards[arrayIndex];
                        cards[arrayIndex]=-1;
                        placed = true;
                    }
                }
            }
        }
    }
    
    @Override
    public void nameCards(){
    String[] symbols = { "cat", "dog", "cow", "moose", "donkey", "horse", "deer",
        "elk", "mouse", "mule", "chicken", "turkey", "emu", "ostrich",  "worm",
        "snail", "penguin", "dragon", "pig", "bird", "giraffe", "elephant", 
        "fish", "whale", "monkey", "bear", "owl", "snake" };
         for(int t=0; t<rowCount; t++){
           for(int i=0; i<columnCount; i++) {
              int cardIndex=getShuffleBoard()[t][i];
             Card thisCard = new Card(symbols [cardIndex]);
             thisCard.setRow(t);
             thisCard.setCol(i);
                board.getBoard()[t][i] = thisCard;
            }
        }        
    }   
}
