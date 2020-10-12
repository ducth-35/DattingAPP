package com.example.dating.model;

public class Ganday {
    private int image;
    private String text;
    private String Statu;
    private String age;
    private String city;
    private String name;



    public Ganday(int image, String text, String statu, String age) {
        this.image = image;
        this.text = text;
        Statu = statu;
        this.age = age;
        this.city = city;
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
