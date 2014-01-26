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
public class Board {
    int columnCount = 4;
    int rowCount = 4;
    
 public Board() {
    }
    
 public void displaySize() {
        System.out.println("\n\tThe board is " + this.rowCount + " by " 
                           + this.columnCount + " in size.");  
}
 
}
