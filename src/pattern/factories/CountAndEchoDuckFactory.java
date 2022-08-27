package pattern.factories;

import pattern.animals.MallardDuck;
import pattern.animals.Quackable;
import pattern.animals.RedheadDuck;
import pattern.animals.RubberDuck;
import pattern.animals.decorated.QuackCounter;
import pattern.animals.decorated.QuackEcho;

public class CountAndEchoDuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new QuackEcho(new MallardDuck()));
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new QuackEcho(new RedheadDuck()));
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new QuackEcho(new RedheadDuck()));
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new QuackEcho(new RubberDuck()));
    }
}
