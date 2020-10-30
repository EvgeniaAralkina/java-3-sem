package pr15;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Test2 {

    public static void mix(int[] p1, int[] p2, int k1, int k2, int f){
        if (f==1) {
            p1[k1] = p1[0];
            p1[k1 + 1] = p2[0];
        } else{
            p1[k1]= p2[0];
            p1[k1+1]=p1[0];
        }
        k1++;
        k2--;
        for (int i = 0; i < k1; i++) {
            p1[i]=p1[i+1];
        }
        p1[k1]=-1;
        for (int i = 0; i < k2; i++) {
            p2[i]=p2[i+1];
        }
        p2[k2]=-1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int player1[] = new int[10];
        int player2[] = new int[10];
        int p1=5, p2 =5;
        int kol = 0;
        for (int i=0;i<10;i++) {
            if (i>4){
                player1[i]=-1;
                continue;
            }
            System.out.print("Enter number for player 1: ");
            int k = scan.nextInt();
            player1[i] = k;
        }
        for (int i=0;i<10;i++) {
            if (i>4){
                player2[i]=-1;
                continue;
            }
            System.out.print("Enter number for player 2: ");
            int k = scan.nextInt();
            player2[i] = k;
        }
        while(player1[0]!=-1 && player2[0]!=-1 && kol<107){
            if ((player1[0]!=9 && player2[0]==0) && player1[0]>player2[0] || player1[0]==0&&player2[0]==9)
                mix(player1, player2, p1, p2, 1);
             else
                mix(player2, player1, p2, p1,2);
             kol+=1;
        }
        if (player1[0]==-1 )
            System.out.print("second"+kol);
        else if (player2[0]==-1)
            System.out.print("first"+kol);
        else
            System.out.print("botva");
    }
}
