package za.co.lzinc.controller.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.lzinc.domain.account.Transaction;
import za.co.lzinc.service.account.impl.TransactionService;

import java.util.List;


@RestController
@RequestMapping("/transaction")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @PostMapping("/create")
    public ResponseEntity<Transaction> createInsight() {
        Transaction committedTransaction = transactionService.create(new Transaction());
        return ResponseEntity.ok(committedTransaction);
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<Transaction>> getAllTransactions() {
        List<Transaction> transactions = transactionService.getAll();
        return ResponseEntity.ok(transactions);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Transaction> updateTransaction(@RequestBody Transaction transaction, @PathVariable String id) {
        Transaction updatedTransaction = transactionService.update(transaction, id);
        return ResponseEntity.ok(updatedTransaction);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteTransaction(@PathVariable String id) {
        transactionService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
