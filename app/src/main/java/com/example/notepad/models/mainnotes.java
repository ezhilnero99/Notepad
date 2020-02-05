package com.example.notepad.models;

public class mainnotes {
    int images;
    String title,tag;
    Boolean fav;

    public mainnotes(int images, String title, String tag, Boolean fav) {
        this.images = images;
        this.title = title;
        this.tag = tag;
        this.fav = fav;
    }

    public mainnotes() {
    }

    public mainnotes(String title, String tag, Boolean fav) {
        this.title = title;
        this.tag = tag;
        this.fav = fav;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Boolean getFav() {
        return fav;
    }

    public void setFav(Boolean fav) {
        this.fav = fav;
    }
}
