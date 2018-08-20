import java.io.IOException;
import java.util.Random;

/**
 * Created by aime1 on 8/19/18.
 */
public class HelloWorldApplication {

    public static void main(String[] args) {
//        System.out.println("Hello World");
//
//
//        Random random = new Random();
//        for(int i = 0; i < 100; i++){
//            System.out.println((int)(random.nextDouble()*37));
//        }
//
//        System.out.println(Integer.valueOf("6000abc"));

        Roulette roulette = new EuropeanRoulette();

        int countWin = 0;
        int countLose = 0;
        for(int i  = 0; i < 10000000; i++){
            if(roulette.betOnEven(1) > 0){
                countWin++;
            } else {
                countLose++;
            }
        }

        System.out.println(countWin);
        System.out.println(countLose);
    }

}
