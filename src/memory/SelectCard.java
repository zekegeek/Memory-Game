/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

/**
 *@author 
 * Charlotte Cook 1/21/14 Created class
 * Cook and Roebuck 1/29/14 created problem, matrix and algorithm
 * Cook 1/30/14 translated algorithm to Java
 */
public class SelectCard {
    public void location(){
        char horiz = 'I';
        byte vert = 3;//will be user input later
        if (vert<1 || vert>6){
          System.out.println("That is not a valid number."
                  + "\nPlease enter a value between 1 and 6.");
        }
        else{
            horiz = 'A';//will be user input later
            if (horiz!='A'){
            //and 'B','C','D','E','F','G','H','a','b','c','d','e','f','g','h'){
            //when we learn how to do that    
                System.out.println("That is an invalid value."
                        + "\nPlease enter a letter between A and H.");
            }
        }
        char card;
        card = (char)((char) vert+horiz);
        //return card;
    }
}

