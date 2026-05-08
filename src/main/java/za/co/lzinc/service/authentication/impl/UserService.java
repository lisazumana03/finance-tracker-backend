package za.co.lzinc.service.authentication.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.lzinc.domain.authentication.User;
import za.co.lzinc.repository.authentication.UserRepository;
import za.co.lzinc.service.authentication.IUserService;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User update(User user, Integer integer) {
        if(userRepository.existsById(user.getUserId())){
            return userRepository.save(user);
        }
        return null;
    }

    @Override
    public void deleteById(Integer integer) {
        userRepository.deleteById(integer);
    }

    @Override
    public List<User> findByEmail(String email){
        System.out.println("Searching for email: " +email);
        List<User> users = userRepository.findByEmail(email);
        System.out.println("Found users: " + users.size());
        return users;
    }
}
