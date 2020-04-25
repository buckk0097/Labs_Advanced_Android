package com.example.lab1_examples;

public class DataMembers_example {
/*
         // EXAMPLE 1 USING NON STATIC
    int Money;
    String FirstNAme;

    public static void main(String[] args) {
        System.out.println(Money);

 */
        // EXAMPLE 2 USING STATIC
  /*  static int Money = 100;
     String FirstNAme;

        public static void main(String[] args) {
        System.out.println(Money);

   */
        // EXAMPLE 3 USING CLASS OBJECT
    int Money = 100;
    String FirstNAme;

    public static void main(String[] args) {

        DataMembers_example m = new DataMembers_example();
        System.out.println(m.Money);

    }
}
