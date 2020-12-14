package pr31;

public class Context {
    Strategy strategy;

    void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    void executeStrategy(Client client, Store store) {
        strategy.makeOperation(client, store);
    }
}
