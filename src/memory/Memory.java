/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

import java.util.Scanner;

/**
 *
 * @author Catherine Roebuck and Charlotte Cook
 */
public class Memory {

    //Instance variables
    String name;
    String instructions = "This is the game of Memory\n\n"
           + "You will have the choice to play against another player or the\n"
           + "computer. Each player will take a selecting two cards in an\n"
           + "attempt to find a match. If a match is found, that player gets\n"
           + "another turn. This continues until all the matches are found.\n"
           + "Player One goes first."
           + "Good Luck!!!\n\n";
    
    public static void main(String[] args) {
        Memory myGame = new Memory();
        myGame.getName() ;
        myGame.displayHelp();
        SelectCard card = new SelectCard();
        String card1 = card.location();
        System.out.println(card1);
        
        System.out.println(card1);
        
        // TODO code application logic here
    }
    //Prompt player to enter their name
    public void getName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = input.next();        
    }
    //Display a welcoming message
    public void displayHelp(){
        System.out.println("\nWelcome " + this.name + "\n");
        System.out.println(this.instructions);
    }
}
