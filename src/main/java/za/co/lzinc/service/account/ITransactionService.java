package za.co.lzinc.service.account;

import za.co.lzinc.domain.account.Transaction;
import za.co.lzinc.service.IService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface ITransactionService extends IService<Transaction, String> {
    // Additional methods specific to Transaction can be added here if needed
    // For example, you might want to add a method to find transactions by account ID or date range
    List<Transaction> findByAccountId(String accountId);
    List<Transaction> findByDateRange(LocalDateTime startDate, LocalDateTime endDate);
}
