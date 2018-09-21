package strategy.impl;

import roulette.Roulette;
import strategy.Strategy;

/**
 * Created by aime1 on 9/16/18.
 */
public class TakingYourMoneyAwayStrategy extends Strategy { // 4 OOPs: inheritance

    public TakingYourMoneyAwayStrategy(Roulette roulette, int amount, int numberOfSpin){
        super(roulette, amount, numberOfSpin);// Q: super vs this ?
    }

    public int execute(){
        return 0;
    }
}
