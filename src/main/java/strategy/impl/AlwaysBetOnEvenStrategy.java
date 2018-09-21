package strategy.impl;

import roulette.Roulette;
import strategy.Strategy;

/**
 * Created by aime1 on 9/16/18.
 */
public class AlwaysBetOnEvenStrategy extends Strategy {

    public AlwaysBetOnEvenStrategy(Roulette roulette, int amount, int numberOfSpin){
        super(roulette, amount, numberOfSpin);// Q: super vs this ?
    }

    public int execute(){
        for(int i = 0; i < numberOfSpinnings; i++){
            if(amountInThePocket <= 0){
                break;
            } else {
                amountInThePocket += roulette.betOnEven(10);
                // shortcut as
                // same as
                // amountInThePocket = amountInThePocket + roulette.betOnEven(10);
            }

        }
        return amountInThePocket;
    }

}
