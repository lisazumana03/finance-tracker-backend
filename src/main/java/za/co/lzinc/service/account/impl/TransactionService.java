package za.co.lzinc.service.account.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.lzinc.domain.account.Transaction;
import za.co.lzinc.repository.account.TransactionRepository;
import za.co.lzinc.service.account.ITransactionService;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TransactionService implements ITransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public Transaction create(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    @Override
    public List<Transaction> getAll() {
        return transactionRepository.findAll();
    }

    @Override
    public Transaction update(Transaction transaction, String s) {
        if(transactionRepository.existsById(transaction.getTransactionId())){
            return transactionRepository.save(transaction);
        }
        return null;
    }

    @Override
    public void deleteById(String s) {
        transactionRepository.deleteById(s);
    }

    @Override
    public List<Transaction> findByAccountId(String accountId) {
        return transactionRepository.findByAccountId(accountId);
    }

    @Override
    public List<Transaction> findByDateRange(LocalDateTime startDate, LocalDateTime endDate) {
        return transactionRepository.findByTransactionDate(startDate, endDate);
    }
}
