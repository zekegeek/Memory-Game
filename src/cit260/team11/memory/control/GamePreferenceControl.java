/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit260.team11.memory.control;

import cit260.team11.memory.build.Game;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Cook
 */
public class GamePreferenceControl implements Serializable{
    private Game game;
    private int match=6;
    private int players=2;
    
    GamePreferenceControl(Game game) {
        this.game = game;
    }
    
    public Game getGame(){
        if(game == null) game = new Game();
        game.display();
        return game;
    }
    
    public void setGame(Game game){
        this.game = game;
    }
    
    public int getMatches(){
        setMatch(6);
        System.out.println("\n\tNumber of Matches:" + getMatch());
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of matches you want: ");
        this.setMatch(input.nextInt());
        //this input method accepts Int.
        //possibly change to byte input when know how. 
        if (getMatch()<2 || getMatch() >10){
            System.out.println("Invalid Command. Please enter a valid command.");
        }
        return getMatch();
    }
    
    public int getPlayers(){
        players = 2;
        System.out.println("\n\tNumber of Players:" + players);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of players: ");
        this.players = input.nextInt();
        //this input method ints.
        //possibly change to byte input when know how.
        if (players<1 || players>4){
            System.out.println("Invalid Command. Please enter a valid command.");
        }
        return players;
    } 
    public boolean getDimentions(){
        System.out.println("\n\tBoard Dimentions: Default");
        return true;
    }

    /**
     * @return the match
     */
    public int getMatch() {
        return match;
    }

    /**
     * @param match the match to set
     */
    public void setMatch(int match) {
        this.match = match;
    }

    /**
     * @param players the players to set
     */
    public void setPlayers(int players) {
        this.players = players;
    }
}
