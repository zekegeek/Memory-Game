/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit260.team11.memory.exceptions;

/**
 *
 * @author Sony Style
 */
public class GameException extends Exception {

    /**
     * Creates a new instance of <code>GameException</code> without detail
     * message.
     */
    public GameException() {
    }

    
    public GameException(String msg) {
        super(msg);
    }
    public GameException(String message, Throwable cause) {
        super(message, cause);
    }
    public GameException(Throwable cause) {
        super(cause);
    } 
}
