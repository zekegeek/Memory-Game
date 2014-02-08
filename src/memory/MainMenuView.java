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
public class MainMenuView {
    
    
    private static final String[][] menuItems = {
    
        {"N", "New Game"},
        {"H", "Help"},
        {"X", "Exit Memory"},
    };
    
    MainMenuControl mainMenuControl = new MainMenuControl();
    
    public MainMenuView() {
        
    }
    public void getInput() {
        
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            this.display(); //display the menu
            //get command entered
            command=inFile.nextLine();
            command=command.trim().toUpperCase();
            
            switch (command) {
                case "N":
                    this.mainMenuControl.startGame();
                    break;
                case "H": 
                    this.mainMenuControl.displayHelpMenu();
                    break;
                case "X":
                    break;
                default: 
                    new MemoryError().displayError("Invalid command. Please enter"
                            + "a valid command.");
                    continue;
            }
        } while (!command.equals("X"));
        return;
    }
    public final void display() {
        System.out.println("\n\t================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");
        
        for(int i=0; i< MainMenuView.menuItems.length; i++) {
            System.out.println("\t  " + menuitems[i])[0] + "\t" + menuItems[i][1];
        }
        System.out.println("\t===================================================");
    }
}