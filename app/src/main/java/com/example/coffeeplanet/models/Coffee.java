package com.example.coffeeplanet.models;

public class Coffee {
    private String title,mSubtitle,description;
    private int image,background,decoration,titleColor;

    public Coffee(){

    }
    public Coffee(String title, String mSubtitle, String description, int image, int background, int decoration, int titleColor) {
        this.title = title;
        this.mSubtitle = mSubtitle;
        this.description = description;
        this.image = image;
        this.background = background;
        this.decoration = decoration;
        this.titleColor = titleColor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getmSubtitle() {
        return mSubtitle;
    }

    public void setmSubtitle(String mSubtitle) {
        this.mSubtitle = mSubtitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getBackground() {
        return background;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    public int getDecoration() {
        return decoration;
    }

    public void setDecoration(int decoration) {
        this.decoration = decoration;
    }

    public int getTitleColor() {
        return titleColor;
    }

    public void setTitleColor(int titleColor) {
        this.titleColor = titleColor;
    }
}
