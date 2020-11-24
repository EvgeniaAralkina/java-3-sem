package pr23;

import java.util.ArrayList;

public class Сonverter {



    public static <T> ArrayList<T> convert (T[] arr){
        ArrayList<T> arr1 = new ArrayList<T>();
        for (T i: arr){
            arr1.add(i);

        }
        return arr1;
    }
}
