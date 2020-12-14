package pr31;

import java.util.HashMap;

public class Store {
    HashMap<String, Integer> basket = new HashMap<>();
    int total = 0;
    Store() {
        basket.put("молоко", 150);
        basket.put("кофе", 435);
        basket.put("хлеб", 50);
        basket.put("шоколад", 99);
        for (String i : basket.keySet()) {
            total += basket.get(i);
        }
    }

        void show(){
            for (String i: basket.keySet()){
                System.out.print(i+" "+ basket.get(i)+" руб" + "\n");
            }
            System.out.print("-----------------\nитого к оплате: " + total + " руб\n");
        }

}
