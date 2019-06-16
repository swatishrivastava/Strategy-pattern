package main.java;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehaviour = new FlyNotPossible();
        quackBehaviour = new QuackWithNoSound();
    }


    @Override
    protected void display() {
        System.out.println("I am model duck");
    }


}
