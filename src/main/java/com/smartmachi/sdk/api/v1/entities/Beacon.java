package com.smartmachi.sdk.api.v1.entities;

/**
 * Created by lukaszlesniewski on 11/03/16.
 */
public class Beacon {

    private String id;
    private String url;
    private String text;
    private String owner;
    private String image;

    public Beacon() {}

    public Beacon(String id, String url, String text, String owner, String image) {
        this.id = id;
        this.url = url;
        this.text = text;
        this.owner = owner;
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
