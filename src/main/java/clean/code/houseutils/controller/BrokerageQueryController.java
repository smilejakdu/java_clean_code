package clean.code.houseutils.controller;

import clean.code.houseutils.constants.DealType;
import clean.code.houseutils.policy.BrokeragePolicy;
import clean.code.houseutils.policy.BrokeragePolicyFactory;
import clean.code.houseutils.service.ApartmentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class BrokerageQueryController {
    private final ApartmentService apartmentService;

    @GetMapping("/api/calc/brokerage")
    public Long calcBrokerage(@RequestParam DealType dealType,
                              @RequestParam Long price) {
        BrokeragePolicy policy = BrokeragePolicyFactory.of(dealType);
        return policy.calculate(price);
    }

    // 아파트 ID를 가지고 매매/임대에 따라서 중개수수료를 계산해주는 api
    @GetMapping("/api/calc/apartment/{apartmentId}")
    public Long calcBrokerageByApartmentId(@PathVariable Long apartmentId,
                                           @RequestParam DealType dealType) {
        BrokeragePolicy policy = BrokeragePolicyFactory.of(dealType);
        Long price = apartmentService.getPrice(apartmentId);
        return policy.calculate(price);
    }
}
