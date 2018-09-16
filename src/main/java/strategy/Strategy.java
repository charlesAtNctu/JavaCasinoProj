package strategy;

import roulette.Roulette;

/**
 * Created by aime1 on 9/9/18.
 */
public class Strategy {

    private Roulette roulette;

    private int amountInThePocket;

    private int numberOfSpinnings;

    public Strategy(Roulette roulette, int amount, int numberOfSpin){
        this.roulette = roulette;
        this.amountInThePocket = amount;
        this.numberOfSpinnings = numberOfSpin;
    }

    public abstract int execute(){
        // TODO: abstract part of the 4 OOP
    }

}
