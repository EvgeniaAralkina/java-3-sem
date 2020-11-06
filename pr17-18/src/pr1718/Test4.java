package pr1718;

import java.util.Scanner;

public class Test4 {

    public static int findMax(){
        int max, temp=1;
        Scanner scan = new Scanner(System.in);
        max = scan.nextInt();
        temp = scan.nextInt();
        while (temp!=0){
            if(temp>max)
                max = temp;
            temp = scan.nextInt();
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.print(findMax());
    }
}
