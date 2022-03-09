package clean.code.houseutils.policy;

import clean.code.houseutils.constants.DealType;
import clean.code.houseutils.exception.ErrorCode;
import clean.code.houseutils.exception.HouseUtilsException;

public class BrokeragePolicyFactory {
    private static final RentBrokeragePolicy rentBrokeragePolicy = new RentBrokeragePolicy();
    private static final PurchaseBrokeragePolicy purchaseBrokeragePolicy = new PurchaseBrokeragePolicy();

    public static BrokeragePolicy of(DealType dealType) {
        switch (dealType) {
            case RENT:
                return rentBrokeragePolicy;
            case PURCHASE:
                return purchaseBrokeragePolicy;
            default:
                throw new HouseUtilsException(ErrorCode.INVALID_REQUEST);
        }
    }
}
