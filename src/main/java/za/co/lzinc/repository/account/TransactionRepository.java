package za.co.lzinc.repository.account;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import za.co.lzinc.domain.account.Transaction;

@Repository
public interface TransactionRepository extends MongoRepository<Transaction, String> {
}
