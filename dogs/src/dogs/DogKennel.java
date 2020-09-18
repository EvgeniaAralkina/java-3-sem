package dogs;

import java.util.Scanner;

public class DogKennel {
    public static void main(String[] args) {
        Dog[] dogs = new Dog [3];
        String answ = "", name;
        int i =0;
        int age;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Enter the name of the dog: ");
            name = scan.nextLine();
            System.out.println("Enter the age of the dog: ");
            age = scan.nextInt();
            dogs[i]=new Dog(name, age);
            if (i<2) {
                System.out.println("want to add another dog? (yes/no): ");
                answ = scan.nextLine();
                answ = scan.nextLine();
            }
            i++;
        } while (answ.equals("yes") && i<3);
        System.out.println("Dog Kennel: ");
        for (int l=0; l<i; l++){
            System.out.println(dogs[l].toString());
        }
    }
}
