/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit260.team11.memory.control;

import cit260.team11.memory.build.Game;
import cit260.team11.memory.menus.GamePreferenceView;
import cit260.team11.memory.menus.HelpMenuView;
import cit260.team11.memory.interfaces.MainMenuInterface;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Catherine
 */
public class MainMenuControl implements Serializable, MainMenuInterface {
    @Override
    public void displayGamePreferenceMenu() {
        Game game = new Game();
        GamePreferenceView gamePreferenceMenu = new GamePreferenceView();
        gamePreferenceMenu.display();
    }

    @Override
     public void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        //helpMenu.getInput();
    }
     
     @Override
     public void exit() {
     System.out.println("Thanks for playing!");
     System.exit(0);
     }
}