package pr27;

public class pr27_4 {

    public static String newNum(String str){
        String[] s = str.split("");
        String number ="";
        if (!s[0].equals("+"))
            number +="+";
        for (int i = 0; i < s.length; ++i) {
            if (i == s.length - 4 || i == s.length - 7)
                number += "-";

            number += s[i];
        }
        return number;
    }

    public static void main(String[] args) {
        String num1 = "+104289652211";
        String num2 = "89175655655";
        System.out.print(newNum(num1) + "\n"+newNum(num2));
    }
}

