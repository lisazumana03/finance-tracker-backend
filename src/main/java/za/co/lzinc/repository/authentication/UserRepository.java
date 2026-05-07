package za.co.lzinc.repository.authentication;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import za.co.lzinc.domain.authentication.User;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, Integer> {
    List<User> findByEmail(String email);
}
