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
public class HelpMenuView {
    private static String[][] menuItems = {
        {"R", "Resume Game"},
        {"M", "Quit and go to Main Menu"},
        {"A", "About Memory"},
        {"B", "Board Overview"},
        {"H", "How to Play"}            
    };

    /**
     * @return the menuItems
     */
    public static String[][] getMenuItems() {
        return menuItems;
    }

    /**
     * @param aMenuItems the menuItems to set
     */
    public static void setMenuItems(String[][] aMenuItems) {
        menuItems = aMenuItems;
    }
    //create instance of the HelpMenuControl (action) class
    private HelpMenuControl helpMenuControl = new HelpMenuControl();
    
    public HelpMenuView(){
        
    }
    
    //display help menu and get input
    public void getInput(){
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do{
            this.display();//display menu
            //user input
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command){
                case "R":
                    break;
                case "M":
                    this.getHelpMenuControl().displayMainMenu();
                    break;
                case "A":
                    this.getHelpMenuControl().diplayGameHelp();
                    break;
                case "B":
                    this.getHelpMenuControl().displayBoardHelp();
                    break;
                case "H":
                    this.getHelpMenuControl().displayPlayerHelp();
                    break;
                default:
                    System.out.println("Invalid command. Please enter a valid command.");
                    continue;
            }
        }
        while(!command.equals("R")||!command.equals("M"));
        return;
    }
    public final void display(){
        System.out.println("\n\t==========================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");
        for (int i=0; i < HelpMenuView.getMenuItems().length; i++){
            System.out.println("\t   " + getMenuItems()[i][0] + "\t" + getMenuItems()[i][1]);
        }
        System.out.println("\t==========================================");            
    }

    /**
     * @return the helpMenuControl
     */
    public HelpMenuControl getHelpMenuControl() {
        return helpMenuControl;
    }

    /**
     * @param helpMenuControl the helpMenuControl to set
     */
    public void setHelpMenuControl(HelpMenuControl helpMenuControl) {
        this.helpMenuControl = helpMenuControl;
    }
}