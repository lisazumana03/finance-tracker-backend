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

    public String getTransactionId() {
        return transactionId;
    }

    public User getUserId() {
        return userId;
    }

    public Account getAccountId() {
        return accountId;
    }

    public double getAmount() {
        return amount;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public Category getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public List<String> getTags() {
        return tags;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId='" + transactionId + '\'' +
                ", userId=" + userId +
                ", accountId=" + accountId +
                ", amount=" + amount +
                ", transactionType=" + transactionType +
                ", category=" + category +
                ", description='" + description + '\'' +
                ", transactionDate=" + transactionDate +
                ", tags=" + tags +
                ", location='" + location + '\'' +
                '}';
    }

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
