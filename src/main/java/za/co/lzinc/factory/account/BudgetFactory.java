package za.co.lzinc.factory.account;

import za.co.lzinc.domain.account.Budget;
import za.co.lzinc.domain.account.Category;
import za.co.lzinc.domain.account.Period;
import za.co.lzinc.domain.authentication.User;

import java.time.LocalDateTime;

public class BudgetFactory {
    public static Budget designBudget(String budgetId, User userId, Category categoryId, double limit,
                                      Period period, LocalDateTime startDate, LocalDateTime endDate) {
        return new Budget.Builder()
                .setBudgetId(budgetId)
                .setUserId(userId)
                .setCategoryId(categoryId)
                .setLimit(limit)
                .setPeriod(period)
                .setStartDate(startDate)
                .setEndDate(endDate)
                .build();
    }
}
