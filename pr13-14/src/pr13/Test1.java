package pr13;

import java.util.Random;



public class Test1 {

    static void sort(Student mas[]) {
        boolean isSorted = false;
        Student buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i].getId() > mas[i + 1].getId()) {
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
        String names[]={"John", "Mike", "Lisa", "Kate", "Nick"};
        String names2[] = {"Williams", "Miller", "Martinez", "Moore", "Hall"};
        for (int i = 0; i < 10; ++i){
            students[i] = new Student(rand.nextInt(1000)+1000 + rand.nextInt(1000)+1000,names[rand.nextInt(5)]+" "+names2[rand.nextInt(5)], rand.nextInt(5)+1, rand.nextInt(5)+1,rand.nextInt(5)+1);
        }
        for (Student i: students){
            System.out.print(i.getSum()+"\n");
        }
        /*sort(students);
        System.out.print("Students id:\n");
        for (Student i: students){
            System.out.print(i.getId()+"\n");
        }*/
        SortingStudentsByGPA sort = new SortingStudentsByGPA();
        System.out.print("\n\nNEW\n\n");
        sort.mergeSort1(students, 0,9);
        //sort.quickSort(students, 0, 9);
        for (Student i: students){
            System.out.print(i.getSum()+"\n");
        }

    }

}
