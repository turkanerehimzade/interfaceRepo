package org.example;

public class Main {
    public static void main(String[] args) {

        Swimmable swimmable=new Fish();
        swimmable.swim();

       Flyable flyable=new Bat();
       flyable.fly();

       Flyable flyable1=new Bird();
       flyable1.fly();
    }
}