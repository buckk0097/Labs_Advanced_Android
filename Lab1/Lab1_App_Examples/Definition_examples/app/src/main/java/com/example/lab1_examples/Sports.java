package com.example.lab1_examples;

public class Sports {
/*
        // THIS CLASS SHOULD BE IN THE SAME PACKAGE WITH OUR ACTIVITY
        // NO_MODIFIER EXAMPLE BEFORE THE VARIABLES
        String mType;
        int mYear;
 */
/*
        // THIS CLASS DOESNT HAVE TO BE IN THE SAME PACKAGE WITH OUR ACTIVITY
        // USING PUBLIC BEFORE THE VARIABLES MAKES THEM ACCESSIBLE FROM EVERYWHERE
        public String mType;
        public int mYear;

 */
        // THIS CLASS HAVE TO BE IN THE SAME PACKAGE WITH OUR ACTIVITY
        // USING PRIVATE MAKES SURE THAT OUR VARIABLES ARE NOT AFFECTED INDIRECTLY BY OTHER USERS
        public String mType;
        private int mYear;
}
