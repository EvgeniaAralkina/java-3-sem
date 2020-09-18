package rand;
import java.util.Arrays;
import java.util.Random;
public class Class1 {
   public static void main(String[] args) {
        int n =(int)(Math.random()*11+5); //случайное число от 5 до 15 (размер массива)
        int[]arr=new int[n];
       Random ran = new Random();
       int x = ran.nextInt(6) + 5;
       System.out.println(x+"\n");
        for (int i=0;i<n;++i){
            arr[i] = ran.nextInt(6) + 5; //случайные числа от 0 до 100
        }
        System.out.println(Arrays.toString(arr));
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]){
                    isSorted = false;

                    buf = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

