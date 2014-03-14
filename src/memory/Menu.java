/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

/**
 *
 * @author geojson
 */
public abstract class Menu {
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
    private String[][] menuItems = null;
    public Menu() {
    }
    public Menu(String[][] menuItems) {
        this();
        this.menuItems = menuItems;
    }
    
    public abstract String executeCommands (Object object);
    
    public String[][] getMenuItems() {
        return menuItems;
    }
    
    public void setMenuItems(String[][] menuItems) {
        this.menuItems = menuItems;
    }
    
}
