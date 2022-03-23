package com.example.iboto;

public class NewsModel {
    private int img;
    private String title;
    private String description;
    private String url;

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public NewsModel(int img, String title, String description, String url) {
        this.img = img;
        this.title = title;
        this.description = description;
        this.url = url;
    }


}
