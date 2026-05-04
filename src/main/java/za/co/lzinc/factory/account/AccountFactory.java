package za.co.lzinc.factory.account;

import za.co.lzinc.domain.account.Account;
import za.co.lzinc.domain.account.AccountType;
import za.co.lzinc.domain.authentication.User;

import java.time.LocalDateTime;

public class AccountFactory {
    public static Account createAccount(String accountId, User user,
                                        String accountName, AccountType accountType,
                                        double accountBalance, LocalDateTime creationDate){
        return new Account.Builder()
                .setAccountId(accountId)
                .setUser(user)
                .setAccountName(accountName)
                .setAccountType(accountType)
                .setAccountBalance(accountBalance)
                .setCreationDate(creationDate)
                .build();
        }
}
