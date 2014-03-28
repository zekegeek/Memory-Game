/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit260.team11.memory.menus;

import cit260.team11.memory.interfaces.EnterInfo;
import cit260.team11.memory.enums.Status;
import static cit260.team11.memory.enums.Status.PLAYING;
import java.util.Scanner;
import cit260.team11.memory.control.MainMenuControl;
import cit260.team11.memory.exceptions.MenuException;
/**
 *
 * @author Catherine
 */
public class MainMenuView extends Menu{
    
    
    private static final String[][] menuItems = {
    
        {"N", "New Game"},
        {"H", "Help"},
        {"X", "Exit Memory"},
    };
    

    
    MainMenuControl mainMenuControl = new MainMenuControl();
    
    public MainMenuView() {
        super(MainMenuView.menuItems);
    }
    
    
    @Override
    public Status getInput(Object object){
        //String gameStatus = Game.PLAYING;
        String command;
        Status status = Status.PLAYING;
        Scanner inFile = new Scanner(System.in);
        do{
            this.display();
            try {
                //get command
                command = this.getCommand();
                switch (command){
                    case "N":
                        GamePreferenceView gamePref = new GamePreferenceView();
                        gamePref.getInput(null);
                        break;
                    case "H": 
                        HelpMenuView helpMenu = new HelpMenuView();
                        helpMenu.getInput(null);
                    case "X":
                        return Status.EXIT;
                        //break;//will be removed with previous line executes
                    /*default: 
                        displayError();
                        continue;*/
                }
            }
            catch (MenuException e){
                System.out.println("\n"+e.getMessage());
            }
            finally{
                inFile.close();
            }
        } while (!status.equals("EXIT"));
        
        return PLAYING;
    }
    
        StringBuilder dividerLine = new StringBuilder(80);{
        for (int i = 0; i < 80; i++) {
            dividerLine.insert(i, '=');
        }
    }


/*    @Override
       public void executeCommands() {
        //String gameStatus = Game.PLAYING;

        do{
            this.display();
            //get command
            String command = this.getCommand();
            switch (command){
            }

        }
    }*/
}
   /*  
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
                    GamePreferenceView gamePref = new GamePreferenceView();
                    gamePref.getInput();
                    //gamePref.executeCommands(null);
                    break;
                case "H": 
                    HelpMenuView helpMenu = new HelpMenuView();
                    helpMenu.executeCommands(null);
                case "X":
                    //return Game.EXIT;
                    break;//will be removed with previous line executes
                default: 
                    System.out.println("Invalid command. Please enter"
                            + "a valid command.");
                    continue;
            }
        } while (!command.equals("X"));
        return;
    }*/
    

    
 /*   
    public final void display() {
        System.out.println("\n\t================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");
        
        for(int i=0; i< MainMenuView.getMenuItems().length; i++) {
            System.out.println("\t  " + MainMenuView.getMenuItems()[i][0] + "\t" + MainMenuView.getMenuItems()[i][1]);
        }
        System.out.println("\t===================================================");
    }

    
    //@return the mainMenuControl
    
    public MainMenuControl getMainMenuControl() {
        return mainMenuControl;
    }

    
    //@param mainMenuControl the mainMenuControl to set
    
    public void setMainMenuControl(MainMenuControl mainMenuControl) {
        this.mainMenuControl = mainMenuControl;
    }
}

    
    //@return the menuItems    
    public static String[][] getMenuItems() {
        return menuItems;
    }    
    //@param aMenuItems the menuItems to set    
    public static void setMenuItems(String[][] aMenuItems) {
        menuItems = aMenuItems;
    }
    */