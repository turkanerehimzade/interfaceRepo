package org.example;

public class Bat extends Animal implements Flyable{
    @Override
    public void fly() {
        System.out.println("Bat can fly");
    }
}
