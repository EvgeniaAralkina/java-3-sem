package pr15;

import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        List list = new List();
        Random rand = new Random();
        for (int i=0; i<10; ++i){
            //list.add(rand.nextInt(100)+1);
            list.add(i+2);
        }
        for (int i=0; i<10; ++i){
            list.print(i);
            System.out.print(" ");
        }System.out.print("\n");
        list.del(7);
        list.del(0);
        for (int i=0; i<10; ++i){
            list.print(i);
            System.out.print(" ");
        }
        System.out.print("\nMAX: "+list.findMax()+"   MIN: "+list.findMin()+"   AVERAGE: "+ list.average()+ " "+
                "\nlist["+4+"]: "+ list.searchInd(4)+"\n" +
                "element with value: "+ 3+ " has index: "+list.searchValue(3));
    }
}
