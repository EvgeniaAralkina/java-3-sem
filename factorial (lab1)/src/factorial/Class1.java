package factorial;

import java.util.Scanner;

public class Class1 {
    public static int Factoril(int a) {
        if (a>1) {
            a *= Factoril(a - 1);
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.print("enter the number: ");
        Scanner scan = new Scanner(System.in);
        System.out.print("factorial: " + Factoril(scan.nextInt()));
    }
}
