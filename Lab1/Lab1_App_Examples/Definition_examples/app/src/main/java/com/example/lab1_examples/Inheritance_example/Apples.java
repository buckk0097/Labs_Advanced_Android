package com.example.lab1_examples.Inheritance_example;

public class Apples {
    public static void main(String[] args) {

        FOOD Jacky [] = new FOOD[1];
        Jacky[0] = new Fish();
        Jacky[1] = new Chicken();

        for (int x=0 ; x < 2 ; ++x) {
                Jacky[x].eat();
        }
    }
}
