package za.co.lzinc.factory.account;

import org.junit.jupiter.api.Test;
import za.co.lzinc.domain.account.Category;
import za.co.lzinc.domain.account.Insight;
import za.co.lzinc.domain.authentication.User;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InsightFactoryTest {

    @Test
    void createInsight() {
        String insightId = "ID04";
        User user = new User();
        String month = "November";
        double totalIncome = 450.00;
        double totalExpense = -45.00;
        List<Category> categories = new ArrayList<>();
        Category category = new Category.Builder()
                .setCategoryId("ID005")
                .build();
        categories.add(category);

        LocalDateTime creationDate = LocalDateTime.now();

        Insight insight = InsightFactory.createInsight(insightId, user, month, totalIncome, totalExpense, categories, creationDate);
        assertNotNull(insight);
        System.out.println("Insight: " + insight);
    }
}