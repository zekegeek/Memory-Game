/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit260.team11.memory.menus;

import cit260.team11.memory.interfaces.EnterInfo;
import cit260.team11.memory.enums.Status;
import static cit260.team11.memory.enums.Status.PLAYING;
import cit260.team11.memory.exceptions.MenuException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cook
 */
public class HelpMenuView extends Menu {
    public static final String BOARD = "BOARD";
    public static final String GAME = "GAME";
    public static final String PLAYER = "PLAYER";
    
    private final static String[][] menuItems = {
        {"R", "Resume Game"},
        {"M", "Quit and go to Main Menu"},
        {"A", "About Memory"},
        {"B", "Board Overview"},
        {"H", "How to Play"}            
    };

   
    
    public HelpMenuView(){
        super(HelpMenuView.menuItems);
    }
    
    //display help menu and get input
    @Override
    public Status getInput(Object object) {
        String command;
        Status status = Status.PLAYING;
        Scanner inFile = new Scanner(System.in);
        do{
            this.display();//display menu
            try {
                //user input
                command = this.getCommand();
                switch (command){
                    case "R":
                        break;
                    case "M":
                        MainMenuView mainMenu = new MainMenuView();
                        mainMenu.getInput(null);
                        break;
                    case "G":
                        this.displayHelp(HelpMenuView.GAME);
                        break;
                    case "B":
                        this.displayHelp(HelpMenuView.BOARD);
                        break;
                    case "P":
                        this.displayHelp(HelpMenuView.PLAYER);
                        break;
                    /*default:
                        displayError();
                        continue;*/
                }
            } 
            catch (MenuException ex) {
                System.out.println("\n"+ex.getMessage());
            }
            finally{
                inFile.close();
            }
        }
        while(!status.equals("EXIT"));
        return PLAYING;
    }
    
    private void displayHelp(String helpType){
        
        String helpText = null;
        switch (helpType){
            case HelpMenuView.BOARD: helpText = 
                "\t The game board for Memory. It consists of a grid of \n\t cards. "
                + "\n\tEach card has a value. Players select cards in an effort to "
                + "\n\tfind pairs of matching card values; the player with the most "
                + "\n\tmatching pairs wins the game. The default board is 4 rows"
                + "\n\tby 4 columns.";
                break;
                
            case HelpMenuView.GAME: helpText = 
                "\tThe objective of the game is to find more pairs of cards with"
                + "\n\t matching values than the other player. Each player"
                + "\n\t takes turns selecting pairs of cards in search of"
                + "\n\tmatching values. When all the cards have been matched"
                + "\n\t the player that found the most matched pairs wins.";
                break;
                
            case HelpMenuView.PLAYER: helpText = 
                "\t A player takes their turn by selecting two cards from the board; "
                + "\n\tif the cards are a match, the player selects two more"
                + "\n\t cards. The turn ends when the player selects two "
                + "\n\t cards that are not a match or when all the cards "
                + "\n\t have been matched.";
                break;
        }
    
        StringBuilder dividerLine = new StringBuilder(80);
        for (int i = 0; i < 80; i++) {
            dividerLine.insert(i, '~');
        }
        
        System.out.println("\t" + dividerLine.toString());
        System.out.println(helpText);
        System.out.println("\t" + dividerLine.toString());
    }

/*    @Override
    public void executeCommands() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
}
   
    /*
    public final void display(){
        System.out.println("\n\t==========================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");
        for (int i=0; i < HelpMenuView.getMenuItems().length; i++){
            System.out.println("\t   " + getMenuItems()[i][0] + "\t" + getMenuItems()[i][1]);
        }
        System.out.println("\t==========================================");            
    }

    
    //@return the helpMenuControl
     
    public HelpMenuControl getHelpMenuControl() {
        return helpMenuControl;
    }

    
    //@param helpMenuControl the helpMenuControl to set
    
    public void setHelpMenuControl(HelpMenuControl helpMenuControl) {
        this.helpMenuControl = helpMenuControl;
    }
 
    //create instance of the HelpMenuControl (action) class
    private HelpMenuControl helpMenuControl = new HelpMenuControl();
}*/