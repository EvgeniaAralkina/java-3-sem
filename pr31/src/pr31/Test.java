package pr31;

import java.util.HashMap;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        Client client = new Client(43234,54387);
        Store store = new Store();
        System.out.print("Ваша корзина:\n");
        store.show();
        System.out.print("\n"+"выберите способ оплаты:\n1 - электронный кошелек\n2 - кредитная карта\n");
        Scanner scan = new Scanner(System.in);
        if(scan.nextInt()==2)
            context.setStrategy(new CreditCard_Strategy());
        else
            context.setStrategy(new E_wallet_Strategy());
        context.executeStrategy(client, store);
    }
}
