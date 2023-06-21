package com.example.android.recipe_book;

public class ListItem {

    private String title;
    private String desc;



    private String content;
    private String image;

    public ListItem(String title, String desc, String content, String image) {
        this.title = title;
        this.desc = desc;
        this.content = content;
        this.image = image;
    }

    public String getHead() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public String getContent() {
        return content;
    }

    public String getImage() {
        return image;
    }
}
