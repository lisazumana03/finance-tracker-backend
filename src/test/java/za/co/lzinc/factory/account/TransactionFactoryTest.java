package za.co.lzinc.factory.account;

import org.junit.jupiter.api.Test;
import za.co.lzinc.domain.account.Account;
import za.co.lzinc.domain.account.Category;
import za.co.lzinc.domain.account.Transaction;
import za.co.lzinc.domain.account.TransactionType;
import za.co.lzinc.domain.authentication.User;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

class TransactionFactoryTest {

    @Test
    void commitTransaction() {
        String transactionId = "T001";
        User userId = new User();
        Account accountId = new Account();
        double amount = 100.00;
        TransactionType transactionType = TransactionType.EXPENSE;
        Category category = new Category();
        String description = "Grocery shopping";
        LocalDateTime transactionDate = LocalDateTime.of(2025, 12, 1, 15, 15);
        List<String> tags = Arrays.asList("groceries", "food");
        String location = "Cape Town"; 


        Transaction transaction = TransactionFactory.commitTransaction(transactionId, userId, accountId, amount, transactionType, category, description, transactionDate, tags, location);
        assertNotNull(transaction);
        System.out.println(transaction);
    }
}