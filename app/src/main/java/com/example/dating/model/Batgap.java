package com.example.dating.model;

public class Batgap {
    private int image;
    private String nama, age, kota;

    public Batgap() {
    }

    public Batgap(int image, String nama, String age, String kota) {
        this.image = image;
        this.nama = nama;
        this.age = age;
        this.kota = kota;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }
}