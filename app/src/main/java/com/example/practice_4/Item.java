package com.example.practice_4;

public class Item {
    private String name;
    private int imageResId;

    public Item(String name, int imageResId) {
        this.name = name;
        this.imageResId = imageResId;
    }
    public String getName() {
        return name;
    }
    public int getImageResId() {
        return imageResId;
    }
}