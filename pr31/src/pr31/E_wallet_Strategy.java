package pr31;

public class E_wallet_Strategy implements Strategy {
    @Override
    public void makeOperation(Client client, Store store) {
        client.eWallet-=store.total;
        System.out.print("Оплата совершена. Баланс электронного кошелька: " + client.eWallet + " руб");
    }
}
