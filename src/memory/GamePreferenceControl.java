/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

import java.util.Scanner;

/**
 *
 * @author Cook
 */
public class GamePreferenceControl {
    private Game game;
    private int match=6;
    private int players=2;
    GamePreferenceControl(Game game) {
        this.game = game;
    }
    
    public Game getGame(){
        return game;
    }
    
    public void setGame(Game game){
        this.game = game;
    }
    
    public int getMatches(){
        match = 6;
        System.out.println("\n\tNumber of Matches:" + match);
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of matches you want: ");
        this.match = input.nextInt();
        //this input method accepts Int.
        //possibly change to byte input when know how. 
        if (match<2 || match >10){
            System.out.println("Invalid Command. Please enter a valid command.");
        }
        return match;
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
}
