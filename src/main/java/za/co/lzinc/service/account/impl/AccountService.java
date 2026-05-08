package za.co.lzinc.service.account.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.lzinc.domain.account.Account;
import za.co.lzinc.repository.account.AccountRepository;
import za.co.lzinc.service.account.IAccountService;

import java.util.List;

@Service
public class AccountService implements IAccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account create(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public List<Account> getAll() {
        return accountRepository.findAll();
    }

    @Override
    public Account update(Account account, String s) {
        if(accountRepository.existsById(account.getAccountId())){
            return accountRepository.save(account);
        }
        return null;
    }

    @Override
    public void deleteById(String s) {
        accountRepository.deleteById(s);
    }
}
