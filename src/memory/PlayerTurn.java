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
public class PlayerTurn {
    private SelectCard choice;
    public void turn(){
        String card1 = choice.location();
        String card2 = choice.location();
        showCards();
        checkMatch();
        //if checkMatch(true){
        //run removeCards function
        //player gets another turn}
            
       
                
    }
    private void showCards(){
        //reveal cards
    }
    private void checkMatch(){
        //check for a match
        //return true or false
    }
    private void removeCards(){
        //remove the two selected cards
    }
}
