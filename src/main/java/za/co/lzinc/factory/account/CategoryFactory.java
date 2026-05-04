package za.co.lzinc.factory.account;

import za.co.lzinc.domain.account.Category;
import za.co.lzinc.domain.account.CategoryType;
import za.co.lzinc.domain.authentication.User;

public class CategoryFactory {
    public static Category classifyCategory(String categoryId, User userId, String name,
                                            CategoryType type, String colour, String icon){
        return new Category.Builder()
                .setCategoryId(categoryId)
                .setUserId(userId)
                .setName(name)
                .setType(type)
                .setColour(colour)
                .setIcon(icon)
                .build();
    }
}
