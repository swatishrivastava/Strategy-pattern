package main.java;

public class FlyNotPossible implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("**I cant fly***");
    }
}
