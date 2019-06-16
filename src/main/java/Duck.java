package main.java;

public abstract class Duck {

    protected FlyBehaviour flyBehaviour;
    protected QuackBehaviour quackBehaviour;

    protected void performFly() {
        flyBehaviour.fly();
    }

    protected void performQuack() {
        quackBehaviour.quack();
    }

    protected void swim() {
        System.out.println("**All ducks can swim***");
    }

    protected abstract void display();

    protected void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    protected void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }


}
