package za.co.lzinc.factory.account;

import org.junit.jupiter.api.Test;
import za.co.lzinc.domain.account.Budget;
import za.co.lzinc.domain.account.Category;
import za.co.lzinc.domain.account.CategoryType;
import za.co.lzinc.domain.account.Period;
import za.co.lzinc.domain.authentication.User;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class BudgetFactoryTest {

    @Test
    void designBudget() {
        String budgetId = "budget123";
        User userId = new User.Builder()
                .setUserId(1)
                .setFullName("John Doe")
                .setEmail("johndoe@gmail.com")
                .setPassword("password123")
                .setPhoneNumber("1234567890")
                .setCreationDate(LocalDateTime.now())
                .setCurrency("USD")
                .build();
        Category categoryId = new Category.Builder()
                .setCategoryId("cat123")
                .setUserId(userId)
                .setName("Groceries")
                .setType(CategoryType.EXPENSE)
                .setColour("#FF0000")
                .setIcon("grocery_icon")
                .build();
        double limit = 500.0;
        Period period = Period.MONTHLY;
        LocalDateTime startDate = LocalDateTime.of(2024, 1, 1, 0, 0);
        LocalDateTime endDate = LocalDateTime.of(2024, 1, 31, 23, 59);

        Budget budget = BudgetFactory.designBudget(budgetId, userId, categoryId, limit, period, startDate, endDate);
        assertNotNull(budget);
        System.out.println("Budget created successfully: " + budget);
    }
}