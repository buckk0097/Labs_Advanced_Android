package com.example.test.model;

public class Contact {

    private String Name ;
    private String Phone ;
    private String Description ;
    private int Photo ;

    public Contact() {
    }

    public Contact(String name, String phone, String description, int photo) {
        Name = name;
        Phone = phone;
        Description = description;
        Photo = photo;
    }


    // Getter


    public String getName() {
        return Name;
    }

    public String getPhone() {
        return Phone;
    }
    public String getDescription() {
        return Description;
    }

    public int getPhoto() {
        return Photo;
    }

    // Setter


    public void setName(String name) {
        Name = name;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setPhoto(int photo) {
        Photo = photo;
    }
}
