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
public class MainMenuView extends Menu {
    
    
    private static String[][] menuItems = {
    
        {"N", "New Game"},
        {"H", "Help"},
        {"X", "Exit Memory"},
    };
    
    /*
    //@return the menuItems    
    public static String[][] getMenuItems() {
        return menuItems;
    }    
    //@param aMenuItems the menuItems to set    
    public static void setMenuItems(String[][] aMenuItems) {
        menuItems = aMenuItems;
    }
    */
    
    MainMenuControl mainMenuControl = new MainMenuControl();
    
    public MainMenuView() {
        super(MainMenuView.menuItems);
    }
    @Override
    
    public String executeCommands(Object object){
        //String gameStatus = Game.PLAYING;
        do{
            this.display();
            //get command
            String command = this.getCommand();
            switch (command){
                
            }
        }
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
                    this.getMainMenuControl().displayGamePreferenceMenu();
                    break;
                case "H": 
                    this.getMainMenuControl().displayHelpMenu();
                    break;
                case "X":
                    break;
                default: 
                    System.out.println("Invalid command. Please enter"
                            + "a valid command.");
                    continue;
            }
        } while (!command.equals("X"));
        return;
    }
    public final void display() {
        System.out.println("\n\t================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");
        
        for(int i=0; i< MainMenuView.getMenuItems().length; i++) {
            System.out.println("\t  " + MainMenuView.getMenuItems()[i][0] + "\t" + MainMenuView.getMenuItems()[i][1]);
        }
        System.out.println("\t===================================================");
    }

    /**
     * @return the mainMenuControl
     */
    public MainMenuControl getMainMenuControl() {
        return mainMenuControl;
    }

    /**
     * @param mainMenuControl the mainMenuControl to set
     */
    public void setMainMenuControl(MainMenuControl mainMenuControl) {
        this.mainMenuControl = mainMenuControl;
    }
}
