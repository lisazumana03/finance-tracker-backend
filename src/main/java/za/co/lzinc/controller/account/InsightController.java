package za.co.lzinc.controller.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import za.co.lzinc.domain.account.Insight;
import za.co.lzinc.service.account.impl.InsightService;

import java.util.List;

@RestController
@RequestMapping("/insight")
public class InsightController {
    @Autowired
    private InsightService insightService;

    @PostMapping("/create")
    public ResponseEntity<Insight> createInsight() {
        Insight createdInsight = insightService.create(new Insight());
        return ResponseEntity.ok(createdInsight);
    }

    @GetMapping
    public ResponseEntity<List<Insight>> getAllInsights() {
        List<Insight> insights = insightService.getAll();
        return ResponseEntity.ok(insights);
    }
}
