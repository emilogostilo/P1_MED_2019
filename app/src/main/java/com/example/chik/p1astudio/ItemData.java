package com.example.chik.p1astudio;

public class ItemData {
    private String name;
    private String description;
    private int image;

    public ItemData(String name, String description, int thumbnail){
            this.name = name;
            this.description = description;
            this.image = thumbnail;
        }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }
}

