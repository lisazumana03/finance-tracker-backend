package za.co.lzinc.service.account;

import za.co.lzinc.domain.account.Account;
import za.co.lzinc.service.IService;

import java.util.List;

public interface IAccountService extends IService<Account, String> {
    List<Account> findByUserId(int userId);
}
