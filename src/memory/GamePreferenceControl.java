/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

/**
 *
 * @author Cook
 */
public class GamePreferenceControl {
    private Game game;

    GamePreferenceControl(Game game) {
        this.game = game;
    }
    
    public Game getGame(){
        return game;
    }
    
    public void setGame(Game game){
        this.game = game;
    }
    
    public void getMatches(){
        System.out.println("\n\tNumber of Matches:" + 6);
        //number is a place holder for now
    }
    
    public void getPlayers(){
        System.out.println("\n\tNumber of Players:" + 2);
        //number is a place holder for now
    } 
    public boolean getDimentions(){
        System.out.println("\n\tBoard Dimentions: Default");
        return true;
    }
}
