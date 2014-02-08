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
public class GamePreferenceView {
    Game game;
    private final GamePreferenceControl gamePreferenceControl = new GamePreferenceControl(game);

    private final static String[][] menuItems = {
        {"P", "Change the Number of Players"},
        {"M", "Change the Number of Matches"},
        {"D", "Change the Dimensions of the Board"},
        {"Q", "Return to Main Menu"}
    };
    
    public GamePreferenceView(Game game){
        this.game = game;
    }
    
    public void getInput(){
        String command;
        Scanner inFile = new Scanner(System.in);
        do{
            this.display();
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            switch (command){
                case "P":
                    this.gamePreferenceControl.getPlayers();
                    break;
                case "M":
                    this.gamePreferenceControl.getMatches();
                    break;
                case "D":
                    this.gamePreferenceControl.getDimentions();
                    break;
                default:
                    System.out.println("Invalid Command. Please enter a valid command.");
                    continue;
            }
        }while (!command.equals("Q"));
    }
    
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < GamePreferenceView.menuItems.length; i++) {
            System.out.println("\t " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }    
}
