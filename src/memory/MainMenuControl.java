/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

import java.util.Scanner;

/**
 *
 * @author Catherine
 */
public class MainMenuControl {
    
    
    public void startGame(long noPlayers) {
    Game game = null;
    
    GamePreferenceView gameMenu = new GamePreferenceView(game);
    gameMenu.getInput();
}

     public void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.getInput();
    }
     
}