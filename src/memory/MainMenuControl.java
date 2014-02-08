/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

import java.util.Scanner;

/**
 *
 * @author Catherine
 */
public class MainMenuControl {
    
    
    public void startGame(long noPlayers) {
    Game game;
    
    GameMenuView gameMenu = new GameMenuView(game);
    gameMenu.getInput();
}

    
public Game create(String gameType) {
    Game game = null;
    Player player1 = null;
    Player player2 = null;
    
    if (gameType == null)
}
}
