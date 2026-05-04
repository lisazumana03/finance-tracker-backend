package za.co.lzinc.factory.account;

import org.junit.jupiter.api.Test;
import za.co.lzinc.domain.account.Category;
import za.co.lzinc.domain.account.CategoryType;
import za.co.lzinc.domain.authentication.User;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class CategoryFactoryTest {

    @Test
    void classifyCategory() {
        String categoryId = "cat123";
        User userId = new User.Builder()
                .setUserId(1)
                .setFullName("John Doe")
                .setEmail("johndoe@gmail.com")
                .setPassword("password123")
                .setPhoneNumber("1234567890")
                .setCreationDate(LocalDateTime.now())
                .setCurrency("USD")
                .build();
        String name = "Groceries";
        CategoryType type = CategoryType.EXPENSE;
        String colour = "#FF0000";
        String icon = "grocery_icon";
        
        Category category = CategoryFactory.classifyCategory(categoryId, userId, name, type, colour, icon);
        assertNotNull(category);
        System.out.println("Category created successfully: " + category);
    }
}