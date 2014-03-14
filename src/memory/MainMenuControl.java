/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Catherine
 */
public class MainMenuControl implements Serializable{
    public void displayGamePreferenceMenu() {
        Game game = new Game();
        GamePreferenceView gamePreferenceMenu = new GamePreferenceView(game);
        gamePreferenceMenu.getInput();
    }

     public void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        //helpMenu.getInput();
    }
     
     public void exit() {
     System.out.println("Thanks for playing!");
     System.exit(0);
     }
     
}