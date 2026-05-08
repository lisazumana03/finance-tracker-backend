package za.co.lzinc.service.authentication;

import za.co.lzinc.domain.authentication.User;
import za.co.lzinc.service.IService;

import java.util.List;

public interface IUserService extends IService<User, Integer> {
    List<User> findByEmail(String email);
}
