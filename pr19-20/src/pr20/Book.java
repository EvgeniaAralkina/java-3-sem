package pr20;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Book {
    static int out(char[] ch,String[] words, String name){
        int i=0;
        int j=0;
        try(FileReader reader = new FileReader(name))
        {
            int c;
            String str = "";
            while((c=reader.read())!=-1){
                if (c==' ') {
                    c = '#';
                    words[j] = str;
                    j++;
                    str="";
                }
                else if (c!= ',' && c!='.' && c!='!' && c!='?'&& c!='—'  &&c!='('&&c!=')' &&c!='&' &&c!='“' && c!=';'&&c!='”')
                    str+=(char)c;
                ch[i]=(char)c;
                i++;
            }
        }
        catch(IOException ex){
            System.out.println("error");
        }


        try(FileWriter writer = new FileWriter(name, false))
        {
            for (int k =0;k<i;k++){
                writer.write(ch[k]);
            }
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        return j;
    }

    static void mergeSort(String [] words, int[] kol, int l, int r)
    {
        if (l == r) return;
        int mid = (l + r) / 2;
        mergeSort(words, kol, l, mid);
        mergeSort(words, kol, mid + 1, r);
        int i = l;
        int j = mid + 1;

        int[] tmpK = new int [r+1];
        String[] tmpN = new String[r+1];
        for (int step = 0; step < r - l + 1; step++)
        {
            if ((j > r) || ((i <= mid) && (kol[i] > kol[j])))
            {
                tmpK[step] = kol[i];
                tmpN[step] = words[i];
                i++;
            }
            else
            {
                tmpK[step] = kol[j];
                tmpN[step] = words[j];
                j++;
            }
        }
        for (int step = 0; step < r - l + 1; step++) {
            words[l + step] = tmpN[step];
            kol[l + step] = tmpK[step];
        }
    }


    public static void main(String[] args) {
        char[] ch = new char[1000000];
        String[] words = new String[1000000];
        int j = out(ch, words, "w&p.txt");
        if (j < 1000000)
            words = Arrays.copyOf(words, j);
        Arrays.sort(words);
    //    System.out.println(Arrays.toString(words));

        String[] words1 = new String[1000000];
        int[] kol1 = new int[1000000];
        String tmp1 = words[0];
        int num = 1;
        int k = 0;
        for (int i = 1; i < j; i++) {
            if (words[i].equals(tmp1))
                num++;
            else {
                words1[k] = tmp1;
                kol1[k] = num;
                tmp1 = words[i];
                num = 1;
                k++;
            }
        }
        words1[k] = tmp1;
        kol1[k] = num;
       // k++;

        if (k < 1000000) {
            words1 = Arrays.copyOf(words1, k);
            kol1 = Arrays.copyOf(kol1, k);
        }
        mergeSort(words1, kol1,0,k-1);
       // System.out.println(Arrays.toString(words1));
       // System.out.println(Arrays.toString(kol1));

        for (int i=0; i<10;i++){
            System.out.println(words1[i]+" - "+kol1[i]);
        }

    }
}
