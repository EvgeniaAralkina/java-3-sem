package pr21;

import java.util.HashMap;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String[] names = {"Dave J.K.", "Luke G.S.", "Charli L.O.", "Mary J.W.", "Harri C.F."};
        int[] INN ={123456, 111111, 222222, 333333, 444444};

        FurnitureShop shop = new FurnitureShop(10000);
        Person Dave = new Person(1300,"Dave J.K.");
        shop.addChair(new Chair("chair1", 100, "for children", "wood"));
        shop.addChair(new Chair("chair2", 130, "for children", "wood"));
        shop.addSofa(new Sofa("sofa for lounge", 210,"leather", "black"));
        shop.addSofa(new Sofa("sofa", 310, "textile", "yellow"));
        shop.addTable(new Table("dinner table", 300,  "oak", 110));
        Scanner scan  = new Scanner(System.in);
        String name ="k";
        System.out.print("we need to check your INN, please enter your INN : ");
        int inn = scan.nextInt();
        int i =0;
        try{
            while (INN[i]!=inn)
                i++;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.print("\nwrong INN!\nyou cannot shop!");
            return;
        }

        while (!name.equals("0")){
            shop.menu();
            System.out.print("ENTER PRODUCT NAME: ");
            name = scan.nextLine();
            if (name.contains("chair")){
                if (Dave.addChair(shop.getChair(name))==1)
                    shop.sellChair(shop.getChair(name));
            }
            if (name.contains("sofa")){
                if (Dave.addSofa(shop.getSofa(name))==1)
                    shop.sellSofa(shop.getSofa(name));
            }
            if (name.contains("table")){
                if (Dave.addTable(shop.getTable(name))==1)
                    shop.sellTable(shop.getTable(name));
            }
        }

        Dave.showBasket();
    }
}
