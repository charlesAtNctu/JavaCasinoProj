import roulette.EuropeanRoulette;
import roulette.Roulette;

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

        Roulette roulette = EuropeanRoulette.getMeTheSingleton();

        Roulette roulette2 = EuropeanRoulette.getMeTheSingleton();

        Roulette roulette3 = EuropeanRoulette.getMeTheSingleton();

        Roulette roulette4 = EuropeanRoulette.getMeTheSingleton();

        Roulette roulette5 = EuropeanRoulette.getMeTheSingleton();

        Roulette roulette6 = EuropeanRoulette.getMeTheSingleton();

        Roulette roulette7 = EuropeanRoulette.getMeTheSingleton();

        Roulette roulette8 = EuropeanRoulette.getMeTheSingleton();

        System.out.println(roulette.hashCode());
        System.out.println(roulette2.hashCode());
        System.out.println(roulette3.hashCode());
        System.out.println(roulette4.hashCode());
        System.out.println(roulette5.hashCode());
        System.out.println(roulette6.hashCode());
        System.out.println(roulette7.hashCode());
        System.out.println(roulette8.hashCode());



//        int countWin = 0;
//        int countLose = 0;
//        for(int i  = 0; i < 10000000; i++){
//            if(roulette.betOnEven(1) > 0){
//                countWin++;
//            } else {
//                countLose++;
//            }
//        }
//
//        System.out.println(countWin);// 18/37 = 0.486
//        System.out.println(countLose);// 19/37


        // palindrome

    }

}
