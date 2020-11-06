package pr1718;

import java.util.Scanner;

public class Test3 {

    public static String palindrome(String example, String word, String check){
        if (word.length()==1) {
            if ((check + word).equals(example))
                return "YES";
            else
                return "NO";
        }
        check+=word.charAt(word.length()-1);
        return palindrome(example, word.substring(0,word.length()-1), check);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        System.out.print(palindrome(word.replace(" ", ""),word.replace(" ", ""),""));
    }
}
