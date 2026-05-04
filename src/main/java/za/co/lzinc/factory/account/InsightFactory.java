package za.co.lzinc.factory.account;

import za.co.lzinc.domain.account.Category;
import za.co.lzinc.domain.account.Insight;
import za.co.lzinc.domain.authentication.User;

import java.time.LocalDateTime;
import java.util.List;

public class InsightFactory {
    public static Insight createInsight(String insightId, User userId,
                                        String month, double totalIncome,
                                        double totalExpense,
                                        List<Category> topCategories,
                                        LocalDateTime generatedAt){
                                                
        return new Insight.Builder()
        .setInsightId(insightId)
        .setUserId(userId)
        .setMonth(month)
        .setTotalIncome(totalIncome)
        .setTotalExpense(totalExpense)
        .setTopCategories(topCategories)
        .setGeneratedAt(generatedAt)
        .build();

    }
}
