package za.co.lzinc.domain.account;

import org.springframework.data.mongodb.core.mapping.Document;
import za.co.lzinc.domain.authentication.User;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Document
public class Insight implements Serializable {
    private String insightId;
    private User userId;
    private String month;
    private double totalIncome;
    private double totalExpense;
    private List<Category> topCategories;
    private LocalDateTime generatedAt;

    public Insight(){}

    private Insight(Builder builder){
        this.insightId = builder.insightId;
        this.userId = builder.userId;
        this.month = builder.month;
        this.totalIncome = builder.totalIncome;
        this.totalExpense = builder.totalExpense;
        this.topCategories = builder.topCategories;
        this.generatedAt = builder.generatedAt;
    }

    public String getInsightId() {
        return insightId;
    }

    public User getUserId() {
        return userId;
    }

    public String getMonth() {
        return month;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public double getTotalExpense() {
        return totalExpense;
    }

    public List<Category> getTopCategories() {
        return topCategories;
    }

    public LocalDateTime getGeneratedAt() {
        return generatedAt;
    }

    @Override
    public String toString() {
        return "Insight{" +
                "insightId='" + insightId + '\'' +
                ", userId=" + userId +
                ", month='" + month + '\'' +
                ", totalIncome=" + totalIncome +
                ", totalExpense=" + totalExpense +
                ", topCategories=" + topCategories +
                ", generatedAt=" + generatedAt +
                '}';
    }

    public static class Builder{
        private String insightId;
        private User userId;
        private String month;
        private double totalIncome;
        private double totalExpense;
        private List<Category> topCategories;
        private LocalDateTime generatedAt;

        public Builder setInsightId(String insightId) {
            this.insightId = insightId;
            return this;
        }

        public Builder setUserId(User userId) {
            this.userId = userId;
            return this;
        }

        public Builder setMonth(String month) {
            this.month = month;
            return this;
        }

        public Builder setTotalIncome(double totalIncome) {
            this.totalIncome = totalIncome;
            return this;
        }

        public Builder setTotalExpense(double totalExpense) {
            this.totalExpense = totalExpense;
            return this;
        }

        public Builder setTopCategories(List<Category> topCategories) {
            this.topCategories = topCategories;
            return this;
        }

        public Builder setGeneratedAt(LocalDateTime generatedAt) {
            this.generatedAt = generatedAt;
            return this;
        }

        public Builder copy(Insight insight) {
            this.insightId = insight.insightId;
            this.userId = insight.userId;
            this.month = insight.month;
            this.totalIncome = insight.totalIncome;
            this.totalExpense = insight.totalExpense;
            this.topCategories = insight.topCategories;
            this.generatedAt = insight.generatedAt;
            return this;
        }

        public Insight build() {
            return new Insight(this);
        }

    }
}
