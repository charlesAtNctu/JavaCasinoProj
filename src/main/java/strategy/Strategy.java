package strategy;

import roulette.Roulette;

/**
 * Created by aime1 on 9/9/18.
 */
public abstract class Strategy {

    protected Roulette roulette;// protected
    protected int amountInThePocket;
    protected int numberOfSpinnings;

    // public Strategy(){};
    public Strategy(Roulette roulette, int amount, int numberOfSpin){
        this.roulette = roulette;
        this.amountInThePocket = amount;
        this.numberOfSpinnings = numberOfSpin;
    }

    public abstract int execute();

}
