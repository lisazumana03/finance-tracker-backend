package za.co.lzinc.service.account.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.lzinc.domain.account.Budget;
import za.co.lzinc.repository.account.BudgetRepository;
import za.co.lzinc.service.account.IBudgetService;

import java.util.List;

@Service
public class BudgetService implements IBudgetService {

    @Autowired
    private BudgetRepository budgetRepository;

    @Override
    public Budget create(Budget budget) {
        return budgetRepository.save(budget);
    }

    @Override
    public List<Budget> getAll() {
        return budgetRepository.findAll();
    }

    @Override
    public Budget update(Budget budget, String s) {
        if(budgetRepository.existsById(budget.getBudgetId())){
            return budgetRepository.save(budget);
        }
        return null;
    }

    @Override
    public void deleteById(String s) {
        budgetRepository.deleteById(s);
    }
}
