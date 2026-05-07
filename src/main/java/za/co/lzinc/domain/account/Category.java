package za.co.lzinc.domain.account;

import org.springframework.data.mongodb.core.mapping.Document;
import za.co.lzinc.domain.authentication.User;

import java.io.Serializable;

@Document
public class Category implements Serializable {
    private String categoryId;
    private User userId;
    private String name;
    private CategoryType type;
    private String colour;
    private String icon;

    public Category(){}

    private Category(Builder builder){
        this.categoryId = builder.categoryId;
        this.userId = builder.userId;
        this.name = builder.name;
        this.type = builder.type;
        this.colour = builder.colour;
        this.icon = builder.icon;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public User getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public CategoryType getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public String getIcon() {
        return icon;
    }

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

        public Builder setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        public Builder setUserId(User userId) {
            this.userId = userId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setType(CategoryType type) {
            this.type = type;
            return this;
        }

        public Builder setColour(String colour) {
            this.colour = colour;
            return this;
        }

        public Builder setIcon(String icon) {
            this.icon = icon;
            return this;
        }

        public Builder copy(Category category){
            this.categoryId = category.categoryId;
            this.userId = category.userId;
            this.name = category.name;
            this.type = category.type;
            this.colour = category.colour;
            this.icon = category.icon;
            return this;
        }

        public Category build(){
            return new Category(this);
        }
    }
}
