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
public class MenuException extends Exception {

    /**
     * Creates a new instance of <code>MenuException</code> without detail
     * message.
     */
    public MenuException() {
    }
    
    public MenuException(String msg) {
        super(msg);
    }

    public MenuException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public MenuException(Throwable cause) {
        super(cause);
    }
}
