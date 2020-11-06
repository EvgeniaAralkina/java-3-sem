package pr1718;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static boolean ferma(int x){
        if(x == 2)
            return true;
        Random rand = new Random();
        for(int i=0;i<100;i++){
            int a = (rand.nextInt(1000) % (x - 2)) + 2;
            if (gcd(a, x) != 1)
                return false;
        }
        return true;
    }


    public static int gcd(int a, int b){
        if(b==0)
            return a;
        return gcd(b, a%b);
    }


    static void mergeSort(int[] a, int l, int r)
    {
        if (l == r) return; // границы сомкнулись
        int mid = (l + r) / 2; // определяем середину последовательности
        // и рекурсивно вызываем функцию сортировки для каждой половины
        mergeSort(a, l, mid);
        mergeSort(a, mid + 1, r);
        int i = l;  // начало первого пути
        int j = mid + 1; // начало второго пути
        int[] tmp = new int[r+1]; //Arrays.copyOf(a, a.length); // дополнительный массив
        for (int step = 0; step < r - l + 1; step++) // для всех элементов дополнительного массива
        {
            // записываем в формируемую последовательность меньший из элементов двух путей
            // или остаток первого пути если j > r
            if ((j > r) || ((i <= mid) && a[i]<a[j]))
            {
                tmp[step] = a[i];
                i++;
            }
            else
            {
                tmp[step] = a[j];
                j++;
            }
        }
        // переписываем сформированную последовательность в исходный массив
        for (int step = 0; step < r - l + 1; step++)
            a[l + step] = tmp[step];
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       int num = scan.nextInt();
        int[] mul = new int [100];
        int i = 0;
        while(!ferma(num)){
            if (num%2==0){
                mul[i]=2;
                i++;
                num/=2;
            }
            else if(num%3==0){
                mul[i]=3;
                i++;
                num/=3;
            }
            else if(num%5==0){
                mul[i]=5;
                i++;
                num/=5;
            }
            else if(num%7==0){
                mul[i]=7;
                i++;
                num/=7;
            }
            else if(num%11==0){
                mul[i]=11;
                i++;
                num/=11;
            }
            else if(num%13==0){
                mul[i]=13;
                i++;
                num/=13;
            }
            else if(num%17==0){
                mul[i]=17;
                i++;
                num/=17;
            }
            else if(num%19==0){
                mul[i]=19;
                i++;
                num/=19;
            }
        }
        mul[i]=num;
        mergeSort(mul,0,i);
        for (int j=0;j<=i;j++)
            System.out.print(mul[j]+" ");
    }
}
// 609 840 = 2*2*2*2*3*3*6*7*11*11
// 996 = 2*2*3*83