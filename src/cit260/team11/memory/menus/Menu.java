/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit260.team11.memory.menus;

import cit260.team11.memory.interfaces.DisplayInfo;
import cit260.team11.memory.interfaces.EnterInfo;
import java.util.Scanner;

/**
 *
 * @author Roebuck and Cook
 */
public abstract class Menu implements DisplayInfo, EnterInfo{
    
    public interface DisplayInfo {
        void display();
}
    
    public interface EnterInfo {
        void display();
}
   
    protected String[][] menuItems = null;
    public Menu() {
    }
    public Menu(String[][] menuItems) {
        this();
        this.menuItems = menuItems;
        if (menuItems == null) System.out.println("it's totally null, dude.");
    }
    
    /*public abstract void executeCommands ();*/
    
    public String[][] getMenuItems() {
        return menuItems;
    }
    
    public void setMenuItems(String[][] menuItems) {
        this.menuItems = menuItems;
    }
    public void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        //if (menuItems == null) System.out.println("it's totally null, dude.");
        for (int i = 0; i < this.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }

    protected boolean validCommand(String command) {
        String[][] items = this.menuItems;

        for (String[] item : this.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }

protected final String getCommand() {
 
        Scanner inFile = new Scanner(System.in);
        String command;
        boolean valid = false;
        do {
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            valid = validCommand(command);
            //if (!validCommand(command)) {
                //System.out.println("Invalid command: Please enter a valid command.");
                //continue;}
                
        } while (!valid);
        
        return command;
    }
}

 /*
    public Menu() {
    }
    
    public Menu(String[][] menuItems) {
    }
    
    public String[][] getMenuItems() {
    }
    
    public void setMenuItems(String[][] menuItems) {
    }
    protected final void display() {
    }
    private boolean validCommand(String command) {
    }
    protected final */
