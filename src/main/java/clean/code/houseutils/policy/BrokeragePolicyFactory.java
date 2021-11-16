package clean.code.houseutils.policy;

import clean.code.houseutils.constants.DealType;

public class BrokeragePolicyFactory {

    public static BrokeragePolicy of(DealType dealType) throws Exception {
        switch (dealType) {
            case PURCHASE:
                return  new PurchaseBrokeragePolicy();
            case RENT:
                return  new RentBrokeragePolicy();
            default:
                throw new IllegalArgumentException("현재 없는 거래 유형을 입력하였습니다.");
        }
    }

}
