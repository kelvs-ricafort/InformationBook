package com.newtechieblog.wordpress.views.informationbook.models;

public class ModelClass {
    private final String imageName;
    private final String categoryName;

    public ModelClass(int imageName, int categoryName) {
        this.imageName = String.valueOf(imageName);
        this.categoryName = String.valueOf(categoryName);
    }

    public String getImageName() {
        return imageName;
    }

    public String getCategoryName() {
        return categoryName;
    }
}
