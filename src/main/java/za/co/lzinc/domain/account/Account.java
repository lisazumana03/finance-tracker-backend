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
        this.accountName = builder.accountName;
        this.accountBalance = builder.accountBalance;
    }

    public static class Builder{
        private String accountId;
        private User userId;
        private String accountName;
        private AccountType accountType;
        private double accountBalance; //sensitive data
        private LocalDateTime creationDate;
    }
}
