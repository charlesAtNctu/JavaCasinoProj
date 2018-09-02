package roulette;

import java.util.Random;

/**
 * Created by aime1 on 8/19/18.
 */
public class EuropeanRoulette implements Roulette {

    private Random random = new Random();

    private int[] numbers = {  0,  32,  15,  19,   4,  21,   2,  25,  17,  34,   6,  27,  13,  36, 11,  30,  8,  23, 10,   5, 24,  16, 33,   1, 20,  14, 31,   9, 22,  18,  29,   7, 28,  12, 35,    3,  26};
    private char[] colors = {'G', 'R', 'B', 'R', 'B', 'R', 'B', 'R', 'B', 'R', 'B', 'R', 'B', 'R', 'B','R', 'B','R', 'B','R', 'B','R', 'B','R', 'B','R', 'B','R', 'B', 'R', 'B','R', 'B','R', 'B', 'R', 'B'};

    // step 4: instead of letting other people create, i create it within the class myself
    //private static EuropeanRoulette singleInstance = new EuropeanRoulette();
    // eager initalization !!!

    // step 4: instead of letting other people create, i create it within the class myself
    private static EuropeanRoulette singleInstance;
    // eager initalization !!!

    private EuropeanRoulette(){
        // step 1: make consturctor private. only visible to this class, not to the outsider ...
    }

    // step 2: create a static method so people can call it without creating a object of this class.
    // static method can be invoked without object
    //
    public static EuropeanRoulette getMeTheSingleton(){
        // Step 3: make sure you always return the same object to the caller of this method.
        //
        synchronized (EuropeanRoulette.class){// lazy initialization (ineifficient)
            if(singleInstance == null) {
                singleInstance = new EuropeanRoulette();
            }
        }

        return singleInstance;// ==, equals(), ...
    }

    public String getResultInCSV(){// comma separated value format: a,b,c
        //B,26
        //G,0
        // assumption: all the numbers have equal chance to appear in result.
        int index = (int) (random.nextDouble() * 37);
        return String.valueOf(colors[index]) + "," + String.valueOf(numbers[index]);
    }

    // balance: 1000
    // bet on even on 10 bucks -> (10 or -10)
    // balance: 1000 + (10 or -10) = 1010,990
    public int betOnEven(int amount){

        // getResultInCSV() -> "B,26"
        // getResultInCSV().split(",") -> ["B","26"]
        // getResultInCSV().split(",")[0] -> "B"
        // getResultInCSV().split(",")[1] -> "26"

        String numberReturnedByRoulette = getResultInCSV().split(",")[1];

        // "26" -> 26
        int number = Integer.valueOf(numberReturnedByRoulette);

        int remainder = number % 2;

        if(remainder == 0){
            return amount;
        }

        return -amount;
    }
}
