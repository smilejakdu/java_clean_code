package clean.code.houseutils.policy;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BrokerageRule {
    private final Double percentBrokerage;
    private final Long limitAmount;

    public Long calculate(Long price) {
        if (limitAmount == null) {
            return multiplyPercent(price);
        }
        return Math.min(limitAmount, multiplyPercent(price));
    }

    private Long multiplyPercent(Long price) {
        return Double.valueOf(percentBrokerage / 100 * price).longValue();
    }
}
