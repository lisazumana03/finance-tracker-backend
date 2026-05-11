package za.co.lzinc.domain.account;

import org.springframework.data.mongodb.core.mapping.Document;
import za.co.lzinc.domain.authentication.User;

import java.io.Serializable;
import java.time.LocalDateTime;

@Document(collection = "budget")
public class Budget implements Serializable {
    private String budgetId;
    private User userId;
    private Category categoryId;
    private double limit;
    private Period period;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public Budget(){}

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

    @Override
    public String toString() {
        return "Budget{" +
                "budgetId='" + budgetId + '\'' +
                ", userId=" + userId +
                ", categoryId=" + categoryId +
                ", limit=" + limit +
                ", period=" + period +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }

    public static class Builder{
        private String budgetId;
        private User userId;
        private Category categoryId;
        private double limit;
        private Period period;
        private LocalDateTime startDate;
        private LocalDateTime endDate;

        public Builder setBudgetId(String budgetId) {
            this.budgetId = budgetId;
            return this;
        }

        public Builder setUserId(User userId) {
            this.userId = userId;
            return this;
        }

        public Builder setCategoryId(Category categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        public Builder setLimit(double limit) {
            this.limit = limit;
            return this;
        }

        public Builder setPeriod(Period period) {
            this.period = period;
            return this;
        }

        public Builder setStartDate(LocalDateTime startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder setEndDate(LocalDateTime endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder copy(Budget budget){
            this.budgetId = budget.budgetId;
            this.userId = budget.userId;
            this.categoryId = budget.categoryId;
            this.limit = budget.limit;
            this.period = budget.period;
            this.startDate = budget.startDate;
            this.endDate = budget.endDate;
            return this;
        }
        
        public Budget build() {
            return new Budget(this);
        }

    }
}
