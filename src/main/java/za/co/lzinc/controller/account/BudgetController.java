package za.co.lzinc.controller.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.lzinc.domain.account.Budget;
import za.co.lzinc.service.account.impl.BudgetService;

import java.util.List;

@RestController
@RequestMapping("/budget")
public class BudgetController {
    @Autowired
    private BudgetService budgetService;

    @PostMapping("/create")
    public ResponseEntity<Budget> designBudget(){
        Budget createdBudget = budgetService.create(new Budget());
        return ResponseEntity.ok(createdBudget);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Budget>> getAllBudgets() {
        List<Budget> budgets = budgetService.getAll();
        return ResponseEntity.ok(budgets);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Budget> updateBudget(@RequestBody Budget budget, @PathVariable String id) {
        Budget updatedBudget = budgetService.update(budget, id);
        return ResponseEntity.ok(updatedBudget);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteBudget(@PathVariable String id) {
        budgetService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
