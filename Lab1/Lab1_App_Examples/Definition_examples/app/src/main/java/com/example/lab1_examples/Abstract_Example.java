package com.example.lab1_examples;

abstract class Phone {

        String Owner;

        public void Ring() {
            System.out.println("The phone is ringing");
        }
}

class Iphone extends Phone {

}

public class Abstract_Example {

    public static void main(String[] args) {

        Iphone telephone = new Iphone();

        telephone.Ring();
        System.out.println(telephone.Owner);

    }
}
