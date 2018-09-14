package com.patel.viraj.photogallery.Model;

/**
 * Created by patel on 12-09-2018.
 */

public class Image {
    private String id, title, size, dimension, small, medium, large;

    public Image() {
    }


    public Image(String id, String title, String size, String dimension, String small, String medium, String large) {
        this.id = id;
        this.title = title;
        this.size = size;
        this.dimension = dimension;
        this.small = small;
        this.medium = medium;
        this.large = large;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String urlParserOriginal(String farm_id, String server_id, String id, String o_secret) {

        //https://farm{farm-id}.staticflickr.com/{server-id}/{id}_{o-secret}_o.jpg
        return "https://farm" + farm_id + ".staticflickr.com/" + server_id + "/" + id + "_" + o_secret + ".jpg";
    }

    public String urlParserThumbnail(String farm_id, String server_id, String id, String o_secret) {

        //https://farm{farm-id}.staticflickr.com/{server-id}/{id}_{o-secret}_o.jpg
        return "https://farm" + farm_id + ".staticflickr.com/" + server_id + "/" + id + "_" + o_secret + ".jpg";
    }
}
