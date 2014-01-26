/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

/**
 *
 * @author Charlotte Cook
 */
public class SelectCard {
    public String location(){
        String location;
        int vertical;
        vertical = 3;//player chooses vertical later
        String horizontal;
        horizontal = "A";//player chooses horizontal later
        location = vertical+horizontal;
        return location;
    }
}
