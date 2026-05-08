package za.co.lzinc.service.account.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.lzinc.domain.account.Insight;
import za.co.lzinc.repository.account.InsightRepository;
import za.co.lzinc.service.account.IInsightService;

import java.util.List;

@Service
public class InsightService implements IInsightService {

    @Autowired
    private InsightRepository insightRepository;

    @Override
    public Insight create(Insight insight) {
        return insightRepository.save(insight);
    }

    @Override
    public List<Insight> getAll() {
        return insightRepository.findAll();
    }

    @Override
    public Insight update(Insight insight, String s) {
        if(insightRepository.existsById(insight.getInsightId())){
            return insightRepository.save(insight);
        }
        return null;
    }

    @Override
    public void deleteById(String s) {
        insightRepository.deleteById(s);  
    }
}
