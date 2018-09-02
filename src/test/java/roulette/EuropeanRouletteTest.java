package roulette;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EuropeanRouletteTest {

    @Test
    public void testBetOnEven() throws Exception {

        EuropeanRoulette roulette = EuropeanRoulette.getMeTheSingleton();

        int totalNumberOfRun = 10000000;
        int countWin = 0;
        int countLose = 0;
        for(int i  = 0; i < totalNumberOfRun; i++){
            if(roulette.betOnEven(1) > 0){
                countWin++;
            } else {
                countLose++;
            }
        }

        System.out.println(countWin);// 18/37 = 0.486
        System.out.println(countLose);// 19/37

        // 1/5 = 0
        // 7/5 = 1

        double winPossibility = countWin / (1.0*totalNumberOfRun);

        System.out.println(winPossibility);

        double threshold = 0.001;

        Assert.assertTrue(Math.abs(winPossibility - 0.48648648648) < threshold);
    }
}