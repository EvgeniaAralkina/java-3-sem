package pr21;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student_0> {

    void quickSort(Student_0[] numbers, int left, int right)
    {
        Student_0 pivot;
        int l_hold = left;
        int r_hold = right;
        pivot = numbers[left];
        while (left < right)
        {
            while (compare_1(numbers[right],pivot)<0 ||(compare_1(numbers[right],pivot)==0)&& (left < right))
                right--;
            if (left != right)
            {
                Student_0 tmp = numbers[left];
                numbers[left] = numbers[right];
                numbers[right] = tmp;
                left++;
            }
            while (compare_1(numbers[left],pivot)>0 ||(compare_1(numbers[left],pivot)==0) && (left < right))
                left++;
            if (left != right)
            {
                Student_0 tmp = numbers[left];
                numbers[left] = numbers[right];
                numbers[right] = tmp;
                right--;
            }
        }
        numbers[left] = pivot;
        int pivot1 = left;
        left = l_hold;
        right = r_hold;
        if (left < pivot1)
            quickSort(numbers, left, pivot1 - 1);
        if (right > pivot1)
            quickSort(numbers, pivot1 + 1, right);
    }

    void mergeSort(Student_0[] a, int l, int r)
    {
        if (l == r) return; // границы сомкнулись
        int mid = (l + r) / 2; // определяем середину последовательности
        // и рекурсивно вызываем функцию сортировки для каждой половины
        mergeSort(a, l, mid);
        mergeSort(a, mid + 1, r);
        int i = l;  // начало первого пути
        int j = mid + 1; // начало второго пути
        Student_0[] tmp = new Student[r+1]; //Arrays.copyOf(a, a.length); // дополнительный массив
        for (int step = 0; step < r - l + 1; step++) // для всех элементов дополнительного массива
        {
            // записываем в формируемую последовательность меньший из элементов двух путей
            // или остаток первого пути если j > r
            if ((j > r) || ((i <= mid) && compare(a[i],a[j])>0))
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

    static int linearSearch(Student_0[] mas, String key) {
        int j=0;
        try {
            while (!key.equals(mas[j].getName()))
                j++;
        }
        catch (Exception e){
            return -1;
        }
        return j;
    }


    public int compare(Student_0 a, Student_0 b){
        return a.getSum().compareTo(b.getSum());
    }
    public int compare_1(Student_0 a, Student_0 b){
        return  Integer.toString(a.getId()).compareTo( Integer.toString(b.getId()));

    }
}