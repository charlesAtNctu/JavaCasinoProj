import roulette.EuropeanRoulette;
import roulette.Roulette;
import strategy.Strategy;
import strategy.impl.AlwaysBetOnEvenStrategy;
import strategy.impl.TakingYourMoneyAwayStrategy;

/**
 * Created by aime1 on 9/16/18.
 */
public class WhiteWaterCasino {

    public static void main(String[] args) {

        Roulette roulette = EuropeanRoulette.getMeTheSingleton();
        int initialMoney  = 10000;
        int numberOfTimes = 1000;

        Strategy strategy = new AlwaysBetOnEvenStrategy(roulette, initialMoney, numberOfTimes);
        int result = strategy.execute();
        System.out.println("gain or loss: " + (result - initialMoney));


        Strategy strategy2 = new TakingYourMoneyAwayStrategy(roulette, initialMoney, numberOfTimes);
        int result2 = strategy2.execute();
        System.out.println("gain or loss: " + (result2 - initialMoney));


    }
}
