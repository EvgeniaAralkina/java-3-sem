package pr20;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        try {
            System.out.println(2 / i);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("2/0");
        }
    }
}
