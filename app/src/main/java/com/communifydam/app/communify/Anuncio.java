package com.communifydam.app.communify;

/**
 * Created by 2912 on 16/01/2018.
 */

public class Anuncio {

    private int imageId;
    private String title;
    private String description;

    public Anuncio(int imageId, String title, String desc) {
        this.imageId = imageId;
        this.title = title;
        this.description = desc;
    }
    public int getImageId() {
        return imageId;
    }
    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
    public String getDesc() {
        return description;
    }
    public void setDesc(String desc) {
        this.description = desc;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        return title + "\n" + description;
    }
}
