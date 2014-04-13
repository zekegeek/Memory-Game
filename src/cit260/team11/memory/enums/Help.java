/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit260.team11.memory.enums;

/**
 *
 * @author Catherine
 */
public enum Help {
    BOARD ("The game board for Memory. It consists of a grid of cards. "
                + "Each card has a value. Players select cards in an effort to "
                + "find pairs of matching card values; the player with the most "
                + "matching pairs wins the game. The default board is 4 rows "
                + "by 4 columns."),
    GAME ("The objective of the game is to find more pairs of cards with "
                + "matching values than the other player. Each player "
                + "takes turns selecting pairs of cards in search of "
                + "matching values. When all the cards have been matched "
                + "the player that found the most matched pairs wins."),
    PLAYER ("A player takes their turn by selecting two cards from the board; "
                        + "if the cards are a match, the player selects two more "
                        + "cards. The turn ends when the player selects two "
                        + "cards that are not a match or when all the cards "
                        + "have been matched.");
    String helpText;
                        
    private Help(String helpText) {
        this.helpText = helpText;
    }

    public String getHelpText() {
        return helpText;
    }
}