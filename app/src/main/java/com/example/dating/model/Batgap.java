package com.example.dating.model;

public class Batgap {
    private int image;
    private String name, age, address;

    public Batgap() {
    }

    public Batgap(int image, String name, String age, String address) {
        this.image = image;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}