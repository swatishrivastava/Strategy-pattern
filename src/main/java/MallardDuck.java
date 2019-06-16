package main.java;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehaviour= new FlyWithWings();
        quackBehaviour=new QuackWithSound();
    }

    @Override
    protected void display() {
        System.out.println("I am Mallard");
    }
}
