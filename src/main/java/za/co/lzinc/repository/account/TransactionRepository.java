package za.co.lzinc.repository.account;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import za.co.lzinc.domain.account.Transaction;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TransactionRepository extends MongoRepository<Transaction, String> {
    // Custom query methods can be defined here if needed
    // For example, you might want to add a method to find transactions by account ID or date range
    List<Transaction> findByAccountId(String accountId);
    List<Transaction> findByTransactionDate(LocalDateTime startDate, LocalDateTime transactionDate);
}
