package za.co.lzinc.service.account.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.lzinc.domain.account.Category;
import za.co.lzinc.repository.account.CategoryRepository;
import za.co.lzinc.service.account.ICategoryService;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category create(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category update(Category category, String s) {
        if(categoryRepository.existsById(category.getCategoryId())){
            return categoryRepository.save(category);
        }
        return null;
    }

    @Override
    public void deleteById(String s) {
        categoryRepository.deleteById(s);
    }
}
