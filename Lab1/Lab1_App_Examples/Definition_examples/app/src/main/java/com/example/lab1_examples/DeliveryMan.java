package com.example.lab1_examples;

public class DeliveryMan {

    private String mName;
    private int mAge;
    private String gender;

    public DeliveryMan(String mName, int mAge, String gender) {
        this.mName = mName;
        this.mAge = mAge;
        this.gender = gender;
    }
                // Getters used to get the variable name,age and gender
    public String getmName() {
        return mName;
    }
                // Setters used to set the variable name,age and gender
    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getmAge() {
        return mAge;
    }


    public void setmAge(int mAge) {
        this.mAge = mAge;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
