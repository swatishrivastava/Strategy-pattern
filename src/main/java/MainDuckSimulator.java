package main.java;

public class MainDuckSimulator {

    public static void main(String[] args) {

      /*  Duck duck = new MallardDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();*/


        Duck duck = new ModelDuck();
        duck.setFlyBehaviour(new FlyWithRocketWings()); // setting behaviour dynamically
        duck.display();
        duck.performFly();
        duck.performQuack();


    }
}
