package pr13;

import java.util.Arrays;
import java.util.Comparator;


public class SortingStudentsByGPA implements Comparator<Student> {

    void quickSort(Student[] numbers, int left, int right)
    {
        Student pivot; // разрешающий элемент
        int l_hold = left; //левая граница
        int r_hold = right; // правая граница
        pivot = numbers[left];
        while (left < right) // пока границы не сомкнутся
        {
            while (compare(numbers[right],pivot)==1 ||(compare(numbers[right],pivot)==0)&& (left < right))
                right--; // сдвигаем правую границу пока элемент [right] больше [pivot]
            if (left != right) // если границы не сомкнулись
            {
                Student tmp = numbers[left];
                numbers[left] = numbers[right];
                numbers[right] = tmp;
                left++; // сдвигаем левую границу вправо
            }
            while (compare(numbers[left],pivot)==-1 ||(compare(numbers[left],pivot)==0) && (left < right))
                left++; // сдвигаем левую границу пока элемент [left] меньше [pivot]
            if (left != right) // если границы не сомкнулись
            {
                Student tmp = numbers[left];
                numbers[left] = numbers[right];
                numbers[right] = tmp; // перемещаем элемент [left] на место [right]
                right--; // сдвигаем правую границу вправо
            }
        }
        numbers[left] = pivot; // ставим разрешающий элемент на место
        int pivot1 = left;
        //pivot = left;
        left = l_hold;
        right = r_hold;
        if (left < pivot1) // Рекурсивно вызываем сортировку для левой и правой части массива
            quickSort(numbers, left, pivot1 - 1);
        if (right > pivot1)
            quickSort(numbers, pivot1 + 1, right);
    }


    void mergeSort1(Student[] a, int l, int r)
    {
        if (l == r) return; // границы сомкнулись
        int mid = (l + r) / 2; // определяем середину последовательности
        // и рекурсивно вызываем функцию сортировки для каждой половины
        mergeSort1(a, l, mid);
        mergeSort1(a, mid + 1, r);
        int i = l;  // начало первого пути
        int j = mid + 1; // начало второго пути
        Student[] tmp = new Student[r+1]; //Arrays.copyOf(a, a.length); // дополнительный массив
        for (int step = 0; step < r - l + 1; step++) // для всех элементов дополнительного массива
        {
            // записываем в формируемую последовательность меньший из элементов двух путей
            // или остаток первого пути если j > r
            if ((j > r) || ((i <= mid) && gg(a[i],a[j]))) //(Integer.parseInt(a[i].getSum()) < Integer.parseInt(a[j].getSum())))) //Boolean.parseBoolean(Integer.toString(compare(a[i],a[j])))))
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



    public void mergeSort(Student[] a, int lo, int hi) {
        if (hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        mergeSort(a, lo, mid);
        mergeSort(a, mid + 1, hi);

        Student[] buf = Arrays.copyOf(a, a.length);

        for (int k = lo; k <= hi; k++)
            buf[k] = a[k];

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {

            if (i > mid) {
                a[k] = buf[j];
                j++;
            } else if (j > hi) {
                a[k] = buf[i];
                i++;
            } else if (compare(buf[j],buf[i])==-1) {
                a[k] = buf[j];
                j++;
            } else {
                a[k] = buf[i];
                i++;
            }
        }
    }

    public boolean gg(Student a, Student b){
        switch (compare(a, b)){
            case 1:
                return true;
            default:
                return false;

        }
    }

    public int compare(Student a, Student b){
        return a.getSum().compareTo(b.getSum());

    }
}
