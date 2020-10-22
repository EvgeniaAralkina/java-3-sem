package pr13;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Test1 {

    static void bubleSort(int mas[]) {
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;
                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }
            }
        }
    }


    public static void main(String[] args) {
        Random rand = new Random();
        Student students[] = new Student[10];
        int iDNumber[] = new int[10];
        int id;

        String names[] = {"John", "Mike", "Lisa", "Kate", "Nick"};
        String names2[] = {"Williams", "Miller", "Martinez", "Moore", "Hall"};

        for (int i = 0; i < 10; ++i) {
            id = rand.nextInt(1000) + 1000 + rand.nextInt(1000) + 1000;
            iDNumber[i] = id;
            students[i] = new Student(id, names[rand.nextInt(5)] + " " + names2[rand.nextInt(5)], rand.nextInt(5) + 1, rand.nextInt(5) + 1, rand.nextInt(5) + 1);
        }

        System.out.print("id numbers before sorting:\n[");
        for (int i = 0; i < 10; ++i) {
            System.out.print(iDNumber[i]);
            if (i != (iDNumber.length - 1)) {
                System.out.print(", ");
            } else {
                System.out.print("]\n\nid numbers after sorting:\n");
            }
        }
        bubleSort(iDNumber);
        String sortId = Arrays.toString(iDNumber);
        System.out.println(sortId);

        System.out.println("\n"+"--------------------"+"\n\nstudent's list before sorting:\n");
        for (Student i : students) {
            System.out.print(i.toString() + "\n");
        }

        SortingStudentsByGPA sort = new SortingStudentsByGPA();
        System.out.println("choose sort:\n(1 - merge sort, 2 - quick sort\n");
        Scanner scan = new Scanner(System.in);
        switch (scan.nextInt()){
            case 1:
                sort.mergeSort(students, 0,9);
                break;
            case 2:
                sort.quickSort(students, 0, 9);
                break;
            default:
                System.out.print("\nincorrect input!\n");
        }
        System.out.println("\n"+"--------------------"+"\n\nstudent's list after sorting:\n");
        for (Student i : students) {
            System.out.print(i.toString() + "\n");
        }
    }
}