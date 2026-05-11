package za.co.lzinc.domain.account;

import org.springframework.data.mongodb.core.mapping.Document;
import za.co.lzinc.domain.authentication.User;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "user")
public class Transaction implements Serializable {
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

    public Transaction(){}

    private Transaction(Builder builder){
        this.transactionId = builder.transactionId;
        this.userId = builder.userId;
        this.accountId = builder.accountId;
        this.amount = builder.amount;
        this.transactionType = builder.transactionType;
        this.category = builder.category;
        this.description = builder.description;
        this.transactionDate = builder.transactionDate;
        this.tags = builder.tags;
        this.location = builder.location;
    }

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

        public Builder setTransactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }

        public Builder setUserId(User userId) {
            this.userId = userId;
            return this;
        }

        public Builder setAccountId(Account accountId) {
            this.accountId = accountId;
            return this;
        }

        public Builder setAmount(double amount) {
            this.amount = amount;
            return this;
        }

        public Builder setTransactionType(TransactionType transactionType) {
            this.transactionType = transactionType;
            return this;
        }

        public Builder setCategory(Category category) {
            this.category = category;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setTransactionDate(LocalDateTime transactionDate) {
            this.transactionDate = transactionDate;
            return this;
        }

        public Builder setTags(List<String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public Builder copy(Transaction transaction){
            this.transactionId = transaction.transactionId;
            this.userId = transaction.userId;
            this.accountId = transaction.accountId;
            this.amount = transaction.amount;
            this.transactionType = transaction.transactionType;
            this.category = transaction.category;
            this.description = transaction.description;
            this.transactionDate = transaction.transactionDate;
            this.tags = transaction.tags;
            this.location = transaction.location;
            return this;
        }

        public Transaction build(){
            return new Transaction(this);
        }

    }
}
