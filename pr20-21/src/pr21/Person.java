package pr21;

import java.util.LinkedList;

public class Person {
    int budget;
    String name;
    LinkedList<Chair> chairs = new LinkedList<>();
    LinkedList<Sofa> sofas = new LinkedList<>();
    LinkedList<Table> tables = new LinkedList<>();
    public Person(int budget, String name){
        this.budget = budget;
        this.name = name;
    }
    public int addChair(Chair ch){
        if (budget>=ch.price) {
            chairs.add(ch);
            budget -= ch.price;
            return 1;
        }else {
            System.out.println("not enough money");
            return 0;
        }
    }

    public int addSofa(Sofa sf){
        if (budget>=sf.price) {
            sofas.add(sf);
            budget-=sf.price;
            return 1;
        }else {
            System.out.println("not enough money");
            return 0;
        }
    }

    public int addTable(Table tb){
        if (budget>=tb.price) {
            tables.add(tb);
            budget-=tb.price;
            return 1;
        } else {
            System.out.println("not enough money");
            return 0;
        }
    }

    public int getBudget() {
        return budget;
    }

    public void showBasket(){
        System.out.println("YOUR BASKET: ");
        for(Chair ch: chairs){
            System.out.println(ch);
        }
        for(Sofa ch: sofas){
            System.out.println(ch);
        }
        for(Table ch: tables){
            System.out.println(ch);
        }
    }
}
