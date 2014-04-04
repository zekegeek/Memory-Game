package cit260.team11.memory.control;

import cit260.team11.memory.enums.Error;
import cit260.team11.memory.enums.Help;
import cit260.team11.memory.exceptions.MenuException;

        
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
    public String getHelpText(Help command) throws MenuException{
        String helpText = "";
        switch (command){
            case BOARD:
            case PLAYER:
            case GAME:
                helpText = command.getHelpText();
                break;
            default:
                throw new MenuException(Error.ERROR101.getMessage());
        }
        return helpText;
    }
}