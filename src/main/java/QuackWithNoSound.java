package main.java;

public class QuackWithNoSound implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("***I can not quack***");
    }
}
