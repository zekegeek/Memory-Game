package memory;

import java.io.Serializable;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Catherine
 */
public class HelpMenuControl {
    public HelpMenuControl(){
}
    public void displayMainMenu() {
        MainMenuView mainMenu = new MainMenuView();
        //mainMenu.getInput(); //taken out 3/13/2014 to get rid of error when menu superclass was created
    }
    
    public void displayBoardHelp() {
        System.out.println();
        this.displayHelpBorder();
        System.out.println(
        "\t The game board for Memory. It consists of a grid of \n\t cards. "
                + "\n\tEach card has a value. Players select cards in an effort to "
                + "\n\tfind pairs of matching card values; the player with the most "
                + "\n\tmatching pairs wins the game. The default board is 4 rows"
                + "\n\tby 4 columns.");
        displayHelpBorder();
    }
    
    
    public void diplayGameHelp() {
        System.out.println();
        displayHelpBorder();
        System.out.println(
                "\tThe objective of the game is to find more pairs of cards with"
                        + "\n\t matching values than the other player. Each player"
                        + "\n\t takes turns selecting pairs of cards in search of"
                        + "\n\tmatching values. When all the cards have been matched"
                        + "\n\t the player that found the most matched pairs wins."
        );
        displayHelpBorder();
    }
    
    public void displayPlayerHelp() {
        System.out.println();
        displayHelpBorder();
        System.out.println(
                "\t A player takes their turn by selecting two cards from the board; "
                        + "\n\tif the cards are a match, the player selects two more"
                        + "\n\t cards. The turn ends when the player selects two "
                        + "\n\t cards that are not a match or when all the cards "
                        + "\n\t have been matched."
                        );
       displayHelpBorder();
    }
    
    public void displayHelpBorder() {
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}