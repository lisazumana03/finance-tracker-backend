package za.co.lzinc.controller.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/all")
    public ResponseEntity<List<Insight>> getAllInsights() {
        List<Insight> insights = insightService.getAll();
        return ResponseEntity.ok(insights);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Insight> updateInsight(@RequestBody Insight insight, @PathVariable String id) {
        Insight updatedInsight = insightService.update(insight, id);
        return ResponseEntity.ok(updatedInsight);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteInsight(@PathVariable String id) {
        insightService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
