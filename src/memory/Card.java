/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

/**
 *
 * @author Catherine
 */
public class Card {
    public String name;
    public boolean matched;
    public int owner;  
    
    public int row;
    public int col;
    
    public Card (String nameIn)
    {
        name = nameIn;
        matched = false;
        owner = 0;
    }
}
