package za.co.lzinc.controller.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.co.lzinc.domain.account.Budget;
import za.co.lzinc.service.account.impl.BudgetService;

@RestController
@RequestMapping("/budget")
public class BudgetController {
    @Autowired
    private BudgetService budgetService;

    @PostMapping("/create")
    public ResponseEntity<Budget> designBudget(){
        return ResponseEntity.ok(budgetService.create(new Budget()));  
    }

}
