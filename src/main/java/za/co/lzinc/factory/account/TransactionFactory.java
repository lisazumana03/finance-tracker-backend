package za.co.lzinc.factory.account;

import za.co.lzinc.domain.account.Account;
import za.co.lzinc.domain.account.Category;
import za.co.lzinc.domain.account.Transaction;
import za.co.lzinc.domain.account.TransactionType;
import za.co.lzinc.domain.authentication.User;

import java.time.LocalDateTime;
import java.util.List;

public class TransactionFactory {
    public static Transaction commitTransaction(String transactionId, User userId,
                                                Account accountId, double amount,
                                                TransactionType transactionType,
                                                Category category,
                                                String description, LocalDateTime transactionDate,
                                                List<String> tags, String location)
    {
        return new Transaction.Builder()
                .setTransactionId(transactionId)
                .setUserId(userId)
                .setAccountId(accountId)
                .setAmount(amount)
                .setTransactionType(transactionType)
                .setCategory(category)
                .setDescription(description)
                .setTransactionDate(transactionDate)
                .setTags(tags)
                .setLocation(location)
                .build();
    }
}
