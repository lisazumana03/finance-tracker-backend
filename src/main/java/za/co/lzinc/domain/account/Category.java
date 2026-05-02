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

    public static class Builder{
        private String categoryId;
        private User userId;
        private String name;
        private CategoryType type;
        private String colour;
        private String icon;
    }
}
