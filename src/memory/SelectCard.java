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
 * 1/30/14 translated algorithm to Java
 */
public class SelectCard {
    public boolean location(byte vertical, char horizontal){
        char[] validValues = {'A', 'B', 'C','D', 'E', 'F', 'a', 'b', 'c', 'd', 'e', 'f'};
        //char card;
        vertical=3;
        horizontal='f';
        char card = (char)((char) vertical+horizontal);
        if (vertical < 1 || vertical > 6){
          System.out.println("That is not a valid number."
                  + "\nPlease enter a value between 1 and 6.");
          return false;
        }
        else{
            for(int i = 0; i < validValues.length; i++)
            {
                if(validValues[i] == horizontal) return true;
            }
            System.out.println("That is an invalid value."
                + "\nPlease enter a letter between A and F.");
            return false;        }
        //return card;
    }
}

