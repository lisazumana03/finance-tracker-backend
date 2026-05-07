package za.co.lzinc.repository.account;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import za.co.lzinc.domain.account.Category;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String> {
}
