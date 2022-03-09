package clean.code.houseutils.controller;

import clean.code.houseutils.constants.DealType;
import clean.code.houseutils.policy.BrokeragePolicy;
import clean.code.houseutils.policy.BrokeragePolicyFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrokerageQueryController {

    @GetMapping("/api/calc/brokerage")
    public Long calcBrokerage(@RequestParam DealType dealType,
                              @RequestParam Long price) {
        BrokeragePolicy policy = BrokeragePolicyFactory.of(dealType);
        return policy.calculate(price);
    }
}
