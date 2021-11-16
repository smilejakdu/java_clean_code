package clean.code.houseutils.policy;

//java 8 - default method, static method (보조용)
public interface BrokeragePolicy {

    default Long calculate(Long price) {
        BrokerageRule rule = createRule(price);
        return rule.calculate(price);
    }

    BrokerageRule createRule(Long price);

}
