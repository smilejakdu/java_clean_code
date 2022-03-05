package clean.code.houseutils.policy;

import clean.code.houseutils.constants.DealType;
import clean.code.houseutils.exception.ErrorCode;
import clean.code.houseutils.exception.HouseUtilsException;

public class BrokeragePolicyFactory {

    public static BrokeragePolicy of(DealType dealType) {
        switch (dealType) {
            case PURCHASE:
                return new PurchaseBrokeragePolicy();
            case RENT:
                return new RentBrokeragePolicy();
            default:
                throw new HouseUtilsException(ErrorCode.INVALID_REQUEST);
        }
    }
}
