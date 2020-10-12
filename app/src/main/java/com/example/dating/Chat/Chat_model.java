package com.example.dating.Chat;

public class Chat_model {
    private  int Image;
    private  String name;
    private  int image_status;
    private  String message;
    private  String time;
    private  String soluong;

    public Chat_model(int image, String name, int image_status, String message, String time, String soluong) {
        Image = image;
        this.name = name;
        this.image_status = image_status;
        this.message = message;
        this.time = time;
        this.soluong = soluong;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage_status() {
        return image_status;
    }

    public void setImage_status(int image_status) {
        this.image_status = image_status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }
}
