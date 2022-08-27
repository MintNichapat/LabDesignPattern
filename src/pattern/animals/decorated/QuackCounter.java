package pattern.animals.decorated;

import pattern.animals.RedheadDuck;

public class QuackCounter implements Quackable {

    private Quackable duck;
    private static int numberOfQuacks;

    public QuackCounter(RedheadDuck duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }
}
