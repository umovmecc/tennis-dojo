/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package katatennis;

/**
 *
 * @author rhelm
 */
public class Match {

    public static final int PLAYER_A = 1;
    public static final int PLAYER_B = 2;
    private int playerA;
    private int playerB;

    /**
     * @param args the command line arguments
     */
    public Match() {
        // TODO code application logic here
        playerA = 0;
        playerB = 0;
    }

    public String showPlacar() {
        if ((playerA == 0) && (playerB == 0)) {
            return "love";
        } else if ((playerA == 1) && (playerB == 0)) {
            return "15 x 0";
        } else {
            return "";
        }

    }

    public void makePoint(int player) {

        switch (player) {
            case PLAYER_A:
                this.playerA++;
                break;
            case PLAYER_B:
                this.playerB++;
                break;
        }
    }

    public int getPlayerAScore() {
        return playerA;
    }

    public int getPlayerBScore() {
        return playerB;
    }
}
