package pr31;

public class CreditCard_Strategy implements Strategy {
    @Override
    public void makeOperation(Client client, Store store) {
        client.CreditCard-=store.total;
        System.out.print("Оплата совершена. Баланс кредитной карты: " + client.CreditCard + " руб");
    }
}
