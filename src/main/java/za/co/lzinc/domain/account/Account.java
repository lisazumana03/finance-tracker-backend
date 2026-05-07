package za.co.lzinc.domain.account;

import org.springframework.data.mongodb.core.mapping.Document;
import za.co.lzinc.domain.authentication.User;

import java.io.Serializable;
import java.time.LocalDateTime;

@Document
public class Account implements Serializable {
    private String accountId;
    private User user;
    private String accountName;
    private AccountType accountType;
    private double accountBalance; //sensitive data
    private LocalDateTime creationDate;

    public Account(){}

    private Account (Builder builder){
        this.accountId = builder.accountId;
        this.user = builder.user;
        this.accountName = builder.accountName;
        this.accountType = builder.accountType;
        this.accountBalance = builder.accountBalance;
        this.creationDate = builder.creationDate;
    }

    public String getAccountId() {
        return accountId;
    }

    public User getUser() {
        return user;
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
                ", userId=" + user +
                ", accountName='" + accountName + '\'' +
                ", accountType=" + accountType +
                ", accountBalance=" + accountBalance +
                ", creationDate=" + creationDate +
                '}';
    }

    public static class Builder{
        private String accountId;
        private User user;
        private String accountName;
        private AccountType accountType;
        private double accountBalance; //sensitive data
        private LocalDateTime creationDate;

        public Builder setAccountId(String accountId){
            this.accountId = accountId;
            return this;
        }

        public Builder setUser(User user){
            this.user = user;
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
            this.user = account.user;
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
