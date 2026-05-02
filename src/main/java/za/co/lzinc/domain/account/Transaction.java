package za.co.lzinc.domain.account;

import za.co.lzinc.domain.authentication.User;

import java.time.LocalDateTime;
import java.util.List;

public class Transaction {
    private String transactionId;
    private User userId;
    private Account accountId;
    private double amount;
    private TransactionType transactionType;
    private Category category;
    private String description;
    private LocalDateTime transactionDate;
    private List<String> tags;
    private String location;

    private Transaction(Builder builder){}

    public static class Builder{
        private String transactionId;
        private User userId;
        private Account accountId;
        private double amount;
        private TransactionType transactionType;
        private Category category;
        private String description;
        private LocalDateTime transactionDate;
        private List<String> tags;
        private String location;
    }
}
