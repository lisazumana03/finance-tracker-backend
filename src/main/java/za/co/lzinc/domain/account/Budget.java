package za.co.lzinc.domain.account;

import za.co.lzinc.domain.authentication.User;

import java.time.LocalDateTime;

public class Budget {
    private String budgetId;
    private User userId;
    private String categoryId;
    private double limit;
    private Period period;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    private Budget(Builder builder){}

    public static class Builder{
        private String budgetId;
        private User userId;
        private String categoryId;
        private double limit;
        private Period period;
        private LocalDateTime startDate;
        private LocalDateTime endDate;
    }
}
