package pr27;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class pr27_5 {

    public static String getLine(ArrayList<String> arr, Character a) {
        for (String i : arr) {
            if (a.equals(i.charAt(0)))
                return i;
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fileName = scan.nextLine();

        int i = 0;
        ArrayList<String> words = new ArrayList<>();
        try (FileReader reader = new FileReader(fileName)) {
            int c;
            String s = "";
            while ((c = reader.read()) != -1) {
                if ((int) c != 32) {
                    s = s + (char) c;
                } else {
                    words.add(s);
                    s = "";
                    i++;
                }
            }
            words.add(s);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


        StringBuilder result = new StringBuilder(words.get(0));
        Character a= words.get(0).charAt(words.get(0).length()-1);
        words.remove(0);
        while (words.size()>1) {
            String s = getLine(words, a);
            result.append(" " + s);
            a = s.charAt(s.length()-1);
            words.remove(s);
        }
        result.append(" " + words.get(0));
        System.out.println(result.toString()+"\n");
    }
}

