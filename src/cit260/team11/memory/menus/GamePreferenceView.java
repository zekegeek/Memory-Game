/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit260.team11.memory.menus;

import cit260.team11.memory.interfaces.EnterInfo;
import cit260.team11.memory.enums.Status;
import java.io.Serializable;
import java.util.Scanner;
import cit260.team11.memory.build.Game;

/**
 *
 * @author Cook
 */
public class GamePreferenceView extends Menu{
    Game game;
    
    //private final GamePreferenceControl gamePreferenceControl = new GamePreferenceControl();

    protected static final String[][] menuItems = {
        {"S", "Start Game"},
        /*{"P", "Change the Number of Players"},//needs to display current # of players
        {"M", "Change the Number of Matches"},//needs to display current # of matches
        {"D", "Change the Dimensions of the Board"},//Maybe give two options for each number of matches???*/
        {"Q", "Return to Main Menu"}
    };
    
    /*public GamePreferenceView(Game game){
        this.game = game;
    }*/
    
       public GamePreferenceView() {
        super(GamePreferenceView.menuItems);
    }
    
    @Override    
    public Status getInput(Object object){
        //status
        String command;
        String status = "PLAYING";
        Scanner inFile = new Scanner(System.in);
        do{
            this.display();
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            switch (command){
                case "S":
                    game= new Game();
                    game.newGame();
                    break;
               /* case "P":
                    this.gamePreferenceControl.getPlayers();
                    break;
                case "M":
                    this.gamePreferenceControl.getMatches();
                    break;
                case "D":
                    this.gamePreferenceControl.getDimentions();
                    break;*/
                default:
                    displayError();
                    continue;

            }
        }while (!status.equals("EXIT"));
        return Status.EXIT;
    }
    
    /*
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < GamePreferenceView.menuItems.length; i++) {
            System.out.println("\t " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    } */   

/*    @Override
    public void executeCommands() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
}
