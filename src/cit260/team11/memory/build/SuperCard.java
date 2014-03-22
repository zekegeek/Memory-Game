/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit260.team11.memory.build;

/**
 *
 * @author Sony Style
 */
public abstract class SuperCard {
    
    Board board = new Board();
    int rowCount=board.getRowCount();
    int columnCount=board.getColumnCount();
     
    protected int [][] shuffleBoard=null;
    public SuperCard(){        
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
    public abstract void createCards();
    
    public abstract void nameCards();      
}