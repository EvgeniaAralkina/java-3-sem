package pr26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class City {
    public static class City1 {
        String city, country;
        City1(String city, String country){
            this.city = city;
            this.country = country;
        }
    }

    public static void main(String[] args) {
        Map<String, ArrayList<String>> map = new HashMap();
        City1 [] city = new City1[6];
        city[0]=new City1("Moscow", "RU");
        city[1] = new City1("Novosibirsk", "RU");
        city[2] = new City1("London","UK");
        city[3] = new City1("Cardiff","UK");
        city[4] = new City1("Berlin", "BRD");
        city[5] = new City1("München", "BRD");
        ArrayList<String> ru = new ArrayList<>();
        ArrayList<String> uk = new ArrayList<>();
        ArrayList<String> brd = new ArrayList<>();
        for (int i = 0; i<6;i++){
            if (city[i].country.equals("RU"))
                ru.add(city[i].city);
             else if (city[i].country.equals("UK"))
                uk.add(city[i].city);
             else brd.add(city[i].city);
        }
        map.put("RU", ru);
        map.put("UK", uk);
        map.put("BRD", brd);
        System.out.print(map.toString());
    }
}
