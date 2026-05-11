package za.co.lzinc.controller.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import za.co.lzinc.domain.account.Account;
import za.co.lzinc.service.account.impl.AccountService;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @PostMapping("/create")
    public ResponseEntity<Account> createAccount(@RequestBody Account account) {
        Account createdAccount = accountService.create(account);
        return ResponseEntity.ok(createdAccount);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Account>> getAllAccounts() {
        List<Account> accounts = accountService.getAll();
        return ResponseEntity.ok(accounts);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Account> updateAccount(@RequestBody Account account, @PathVariable String id) {
        Account updatedAccount = accountService.update(account, id);
        return ResponseEntity.ok(updatedAccount);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteAccount(@PathVariable String id) {
        accountService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
