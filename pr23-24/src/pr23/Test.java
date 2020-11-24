package pr23;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Сonverter con = new Сonverter();
        Integer[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        String[] arr2 = {"a", "b", "c", "d", "e", "f", "g"};
        ArrayList<Integer> arr1_1 = new ArrayList<Integer>();
        ArrayList<String> arr2_1 = new ArrayList<String>();
        arr1_1 = con.<Integer>convert(arr1);
        arr2_1 = con.<String>convert(arr2);
        System.out.print(arr1_1+"\n"+arr2_1);
        // ----------------------------------------------------------
        Store <Integer> store = new Store<>(arr1);
        Integer i = store.show(2);
        System.out.print("\nэлемент массива с индексом i = "+2+": "+i+"\n");
        ArrayList<String> name = new ArrayList<String>();
        name = store.S("C:\\Users\\Евгения\\IdeaProjects");
        System.out.print("Содержимое папки C:\\Users\\Евгения\\IdeaProjects: \n");
        for (int l =0; l<5; ++l){
            System.out.print(name.get(l) +" ");
        }
    }
}
