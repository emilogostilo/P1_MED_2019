package com.example.chik.p1astudio;

public class Items {
    private String name;
    private String description;
    private int thumbnail;

    public Items() {
    }
    public Items(String name, String description, int thumbnail){
            this.name = name;
            this.description = description;
            this.thumbnail = thumbnail;
        }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getDescrption() {
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    public int getThumbnail() {
        return thumbnail;
    }
    public void setThumbnail(int thumbnail){
        this.thumbnail = thumbnail;
    }
}

