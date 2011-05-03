/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.trevisantecnologia.kata;

import junit.framework.Assert;
import katatennis.Match;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author rhelm
 */
public class TestKataTennis {

    private Match match = null;

    @Before
    public void setUp(){
        match = new Match();
    }

    @Test
    public void shouldReturnLoveForTwoPlayersWhenMatchBegins() {
        //when
        String placar = match.showPlacar();
        
        //then
        Assert.assertEquals("love", placar);
    }

    @Test
    public void shouldReturn15x0PlayerAWinningAfterPlayerAPoint() {
        match.makePoint(1);

        String score = match.showPlacar();

        Assert.assertEquals("Deveria retornar 15 x 0", "15 x 0", score);

    }

    @Test
    public void shouldIncrementPlayerAScoreWhenHePoints(){
        //given
        int initialPoint = match.getPlayerAScore();

        //when
        match.makePoint(Match.PLAYER_A);
        int finalPoint = match.getPlayerAScore();
        int difference = finalPoint - initialPoint;

        //then
        Assert.assertEquals("Deveria ter retonado 1", 1, difference);
    }

    @Test
    public void shouldIncrementPlayerBScoreWhenHePoints(){
        //given
        int initialPoint = match.getPlayerBScore();

        //when
        match.makePoint(Match.PLAYER_B);
        int finalPoint = match.getPlayerBScore();
        int difference = finalPoint - initialPoint;

        //then
        Assert.assertEquals("Deveria ter retonado 1", 1, difference);
    }

}


