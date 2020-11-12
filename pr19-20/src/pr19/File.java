package pr19;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File {

    static void in(String name, String message, boolean boo){
        try(FileWriter writer = new FileWriter(name, boo))
        {
            writer.write(message);
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    static int out(char[] ch, String name){
        int i=0;
        try(FileReader reader = new FileReader(name))
        {
            int c;
            while((c=reader.read())!=-1){
                ch[i]=(char)c;
                i++;
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] ch = new char[100];
        int i=0;
        in("text.txt", scan.nextLine(), false);
        int k = out(ch, "text.txt");

        for (int j=0;j<k;j++)
            System.out.print(ch[j]);

        System.out.println();
        in("text.txt", scan.nextLine(), false);
        in("text.txt", scan.nextLine(), true);
    }
}

