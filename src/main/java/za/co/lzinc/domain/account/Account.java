package za.co.lzinc.domain.account;

import za.co.lzinc.domain.authentication.User;

import java.time.LocalDateTime;

public class Account {
    private String accountId;
    private User userId;
    private String accountName;
    private AccountType accountType;
    private double accountBalance; //sensitive data
    private LocalDateTime creationDate;

    private Account (Builder builder){
        this.accountId = builder.accountId;
        this.userId = builder.userId;
        this.accountName = builder.accountName;
        this.accountType = builder.accountType;
        this.accountBalance = builder.accountBalance;
        this.creationDate = builder.creationDate;
    }

    public String getAccountId() {
        return accountId;
    }

    public User getUserId() {
        return userId;
    }

    public String getAccountName() {
        return accountName;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId='" + accountId + '\'' +
                ", userId=" + userId +
                ", accountName='" + accountName + '\'' +
                ", accountType=" + accountType +
                ", accountBalance=" + accountBalance +
                ", creationDate=" + creationDate +
                '}';
    }

    public static class Builder{
        private String accountId;
        private User userId;
        private String accountName;
        private AccountType accountType;
        private double accountBalance; //sensitive data
        private LocalDateTime creationDate;

        public Builder setAccountId(String accountId){
            this.accountId = accountId;
            return this;
        }

        public Builder userId(User userId){
            this.userId = userId;
            return this;
        }

        public Builder setAccountName(String accountName){
            this.accountName = accountName;
            return this;
        }

        public Builder setAccountType(AccountType accountType){
            this.accountType = accountType;
            return this;
        }

        public Builder setAccountBalance(double accountBalance){
            this.accountBalance = accountBalance;
            return this;
        }

        public Builder setCreationDate(LocalDateTime creationDate){
            this.creationDate = creationDate;
            return this;
        }

        public Builder copy(Account account){
            this.accountId = account.accountId;
            this.userId = account.userId;
            this.accountName = account.accountName;
            this.accountType = account.accountType;
            this.accountBalance = account.accountBalance;
            this.creationDate = account.creationDate;
            return this;
        }

        public Account build(){
            return new Account(this);
        }
    }
}
