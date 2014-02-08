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
    int match;
    int players;
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
        match=6;
        System.out.println("\n\tNumber of Matches:" + match);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of matches you want: ");
        this.match = input.nextInt();
        //this input method only accepts Strings.
        //change to byte input when know how.
    }
    
    public void getPlayers(){
        players=2;
        System.out.println("\n\tNumber of Players:" + players);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of players: ");
        this.players = input.nextInt();
        //this input method only accepts Strings.
        //change to byte input when know how.
    } 
    public boolean getDimentions(){
        System.out.println("\n\tBoard Dimentions: Default");
        return true;
    }
}
