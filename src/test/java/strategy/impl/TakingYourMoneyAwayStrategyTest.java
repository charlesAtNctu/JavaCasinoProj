package strategy.impl;

import junit.framework.Assert;
import org.junit.Test;
import roulette.EuropeanRoulette;
import strategy.Strategy;

import static org.junit.Assert.*;

public class TakingYourMoneyAwayStrategyTest {

    @Test
    public void testExecute(){
        Strategy strategy = new TakingYourMoneyAwayStrategy(
                EuropeanRoulette.getMeTheSingleton(), 10000, 1000);

        Assert.assertTrue(strategy.execute() == 0);
    }



}