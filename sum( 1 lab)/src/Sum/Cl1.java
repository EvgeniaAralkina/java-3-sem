package Sum;

import java.util.Arrays;

public class Cl1 {
    public static void main(String[] args) {
        int[] a={1,4,654,332,3};
        int sumFor=0;
        int sumWhile=0;
        for (int k: a){//int i =0; i<5;i++){
            sumFor+=k;
        }
        int i=0;
        while(i!=a.length){
            sumWhile+=a[i];
            i++;
        }
        i=0;
        int sumWhileDo=0;
        do{
            sumWhileDo+=a[i];
            i++;
        }while (i!=a.length);
        System.out.print("sum (for): "+sumFor+"\nsum(while): "+sumWhile+"\nsum (Do While): "+sumWhileDo) ;
    }
}
