package za.co.lzinc.domain.account;

import za.co.lzinc.domain.authentication.User;

public class Category {
    private String categoryId;
    private User userId;
    private String name;
    private CategoryType type;
    private String colour;
    private String icon;

    private Category(Builder builder){}

    @Override
    public String toString() {
        return "Category{" +
                "categoryId='" + categoryId + '\'' +
                ", userId=" + userId +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", colour='" + colour + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }

    public static class Builder{
        private String categoryId;
        private User userId;
        private String name;
        private CategoryType type;
        private String colour;
        private String icon;
    }
}
