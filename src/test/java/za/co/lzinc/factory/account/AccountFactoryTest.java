package za.co.lzinc.factory.account;

import org.junit.jupiter.api.Test;
import za.co.lzinc.domain.account.Account;
import za.co.lzinc.domain.account.AccountType;
import za.co.lzinc.domain.authentication.User;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class AccountFactoryTest {

    @Test
    void createAccount() {
        String accountId = "LZ005";
        User user = new User();
        String accountName = "Capital Finance";
        AccountType accountType = AccountType.BANK;
        double accountBalance = 245.00;
        LocalDateTime creationDate = LocalDateTime.now();

        Account account = AccountFactory.createAccount(accountId, user, accountName, accountType, accountBalance, creationDate);
        System.out.println(account);
        assertNotNull(account);
    }
}