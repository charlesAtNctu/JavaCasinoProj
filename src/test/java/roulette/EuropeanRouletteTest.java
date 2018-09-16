package roulette;

import com.sun.tools.classfile.ConstantPool;
import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EuropeanRouletteTest {

    @Test
    public void testNumbers() {

        EuropeanRoulette roulette = EuropeanRoulette.getMeTheSingleton();

        int[] countOfEachNumber = new int[37];

        for(int i = 0; i < countOfEachNumber.length; i++){
            countOfEachNumber[roulette.getNumber(i)]++;
        }

        for(int i = 0; i < countOfEachNumber.length; i++){
            Assert.assertTrue(countOfEachNumber[i] == 1);
        }

    }

    @Test
    public void testColors() {

        EuropeanRoulette roulette = EuropeanRoulette.getMeTheSingleton();

        int[] countOfEachColor = new int[3];

        for(int i = 0; i < 37; i++){
            char color = roulette.getColor(i);
            if(color == 'G'){
                countOfEachColor[0]++;
            }
            if(color == 'R'){
                countOfEachColor[1]++;
            }
            if(color == 'B'){
                countOfEachColor[2]++;
            }

        }

        Assert.assertTrue(countOfEachColor[0] == 1);
        Assert.assertTrue(countOfEachColor[1] == 18);
        Assert.assertTrue(countOfEachColor[2] == 18);

    }

//    @Test
//    public void testBetOnEven() throws Exception {
//
//        EuropeanRoulette roulette = EuropeanRoulette.getMeTheSingleton();
//
//        int totalNumberOfRun = 10000000;
//        int countWin = 0;
//        int countLose = 0;
//        for(int i  = 0; i < totalNumberOfRun; i++){
//            if(roulette.betOnEven(1) > 0){
//                countWin++;
//            } else {
//                countLose++;
//            }
//        }
//
//        System.out.println(countWin);// 18/37 = 0.486
//        System.out.println(countLose);// 19/37
//
//        // 1/5 = 0
//        // 7/5 = 1
//
//        double winPossibility = countWin / (1.0*totalNumberOfRun);
//
//        System.out.println(winPossibility);
//
//        double threshold = 0.001;
//
//        Assert.assertTrue(Math.abs(winPossibility - 0.48648648648) < threshold);
//    }
}