package za.co.lzinc.domain.account;

import za.co.lzinc.domain.authentication.User;

import java.time.LocalDateTime;

public class Budget {
    private String budgetId;
    private User userId;
    private Category categoryId;
    private double limit;
    private Period period;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    private Budget(Builder builder){
        this.budgetId = builder.budgetId;
        this.userId = builder.userId;
        this.categoryId = builder.categoryId;
        this.limit = builder.limit;
        this.period = builder.period;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
    }

    public String getBudgetId() {
        return budgetId;
    }

    public User getUserId() {
        return userId;
    }

    public Category getCategoryId() {
        return categoryId;
    }

    public double getLimit() {
        return limit;
    }

    public Period getPeriod() {
        return period;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public static class Builder{
        private String budgetId;
        private User userId;
        private Category categoryId;
        private double limit;
        private Period period;
        private LocalDateTime startDate;
        private LocalDateTime endDate;
    }
}
