package strategy;

public class RubberDuck extends Duck {

    public RubberDuck() {
        setQuackBehavior(new Squeak());
        setFlyBehavior(new FlyNoWay());
    }

    @Override
    void display() {
        System.out.println("I'm a rubber duckie!");
    }
}
