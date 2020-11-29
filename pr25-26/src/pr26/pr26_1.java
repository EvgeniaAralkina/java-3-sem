package pr26;

import pr25.Class1;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class pr26_1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Map<String,String> names =  new HashMap<String, String>();
        String names1[] = {"John", "Mike", "Lisa", "Kate", "Nick"};
        String names2[] = {"Williams", "Miller", "Martinez", "Moore", "Hall"};
        for (int i = 0; i < 10; ++i) {
            names.putIfAbsent(names1[rand.nextInt(5)], names2[rand.nextInt(5)]);
        }
        for(Map.Entry<String, String> item : names.entrySet()){

            System.out.print("Name: " +item.getKey()+ " Surname: "+ item.getValue()+"\n");
        }
    }
}
