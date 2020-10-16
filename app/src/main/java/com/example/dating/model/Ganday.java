package com.example.dating.model;

public class Ganday {
    private int image;
    private String name;
    private String Statu;
    private String age;
    private String city;
    private String text;

    public Ganday(int image, String name, String statu, String age, String city, String text) {
        this.image = image;
        this.name = name;
        Statu = statu;
        this.age = age;
        this.city = city;
        this.text = text;
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

    public String getStatu() {
        return Statu;
    }

    public void setStatu(String statu) {
        Statu = statu;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
