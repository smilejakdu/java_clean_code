package clean.code.houseutils.policy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.lang.Nullable;

@AllArgsConstructor
@Getter
public class BrokerageRule {
    private Long lessThan;
    private final Double brokeragePercent;
    private final Long limitAmount;

    public BrokerageRule(Long lessThan , Double brokeragePercent){
        this(lessThan , brokeragePercent , Long.MAX_VALUE);
    }

    public Long calcMaxBrokerage(Long price) {
        return Math.min(limitAmount, multiplyPercent(price));
    }

    private Long multiplyPercent(Long price) {
        return Double.valueOf(brokeragePercent / 100 * price).longValue();
    }
}
