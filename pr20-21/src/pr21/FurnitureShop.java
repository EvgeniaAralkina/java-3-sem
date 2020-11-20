package pr21;

import java.util.LinkedList;

public class FurnitureShop {
    int budget;
    LinkedList<Chair> chairs = new LinkedList<>();
    LinkedList<Sofa> sofas = new LinkedList<>();
    LinkedList<Table> tables = new LinkedList<>();

    public FurnitureShop(int budget) {
        this.budget = budget;
    }

    public void addChair(Chair ch) {
        if (budget >= ch.price) {
            chairs.add(ch);
            budget -= ch.price;
        } else
            System.out.println("not enough money");
    }

    public void addSofa(Sofa sf) {
        if (budget >= sf.price) {
            sofas.add(sf);
            budget -= sf.price;
        } else
            System.out.println("not enough money");
    }

    public void addTable(Table tb) {
        if (budget >= tb.price) {
            tables.add(tb);
            budget -= tb.price;
        } else
            System.out.println("not enough money");
    }

    public void sellChair(Chair ch) {
        chairs.remove(ch);
        budget += ch.price;
    }

    public void sellSofa(Sofa sf) {
        sofas.remove(sf);
        budget += sf.price;
    }

    public void sellTable(Table tb) {
        tables.remove(tb);
        budget += tb.price;
    }

    public int getBudget() {
        return budget;
    }

    public void menu() {
        System.out.println("Chairs: ");
        for (Chair i : chairs) {
            System.out.println(i);
        }
        System.out.println("Sofas: ");
        for (Sofa i : sofas) {
            System.out.println(i);
        }
        System.out.println("Tables: ");
        for (Table i : tables) {
            System.out.println(i);
        }
    }

    public Chair getChair(String s) {
        for (Chair i : chairs) {
            if (i.name.equals(s))
                return i;
        }
        return chairs.remove(0);
    }
    public Sofa getSofa(String s) {
        for (Sofa i : sofas) {
            if (i.name.equals(s))
                return i;
        }
        return sofas.remove(0);
    }
    public Table getTable(String s) {
        for (Table i : tables) {
            if (i.name.equals(s))
                return i;
        }
        return tables.remove(0);
    }
}
