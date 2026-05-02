package za.co.lzinc.domain.account;

import za.co.lzinc.domain.authentication.User;

import java.time.LocalDateTime;
import java.util.List;

public class Insight {
    private String insightId;
    private User userId;
    private String month;
    private double totalIncome;
    private double totalExpense;
    private List<Category> topCategories;
    private LocalDateTime generatedAt;

    private Insight(Builder builder){}

    public static class Builder{
        private String insightId;
        private User userId;
        private String month;
        private double totalIncome;
        private double totalExpense;
        private List<Category> topCategories;
        private LocalDateTime generatedAt;
    }
}
