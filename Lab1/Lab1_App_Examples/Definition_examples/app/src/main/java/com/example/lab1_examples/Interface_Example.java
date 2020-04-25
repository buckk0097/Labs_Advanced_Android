package com.example.lab1_examples;

    interface Crate {
    String Color = "Brown";
    void openBox() ;
    }

    public class Interface_Example implements Crate {

        public static void main(String[] args) {
            System.out.println(Color);

            Interface_Example box_1 = new Interface_Example();
            box_1.openBox();
        }

        @Override
        public void openBox() {
            System.out.println("The box Has been opened!");
        }
    }
