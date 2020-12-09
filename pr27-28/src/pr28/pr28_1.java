package pr28;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pr28_1 {
    public static void main(String[] args) {
        // IP
        String text = "255.10.0.126";
        Pattern pattern = Pattern.compile("^((1?\\d{1,2})|(2\\d[0-5]))\\." +
                "((1?\\d{1,2})|(2\\d[0-5]))\\.((1?\\d{1,2})|" +
                "(2\\d[0-5]))\\.((1?\\d{1,2})|(2\\d[0-5]))$");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }

        // скобки
        String text2 = "(4+5*(77-3))";
        Pattern p1 = Pattern.compile("^\\([\\d+/*-]*(\\([\\d+/*-]*\\))*\\)$");
        matcher = p1.matcher(text2);
        while (matcher.find()) {
            System.out.println(text2.substring(matcher.start(), matcher.end()));
        }

    }
}
