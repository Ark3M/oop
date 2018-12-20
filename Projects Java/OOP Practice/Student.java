import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class Sorting {

    /*
     * Предотвращаем создание экземпляров.
     */
    private Sorting() {

    }

    /*
     * Быстрая сортировка списка.
     */
    public static <T extends Comparable<? super T>> void quickSort(List<T> list) {
        Object[] arr = list.toArray();
        quickSort(arr, null);

        ListIterator<T> iterator = list.listIterator();
        for (Object obj : arr) {
            iterator.next();
            iterator.set(((T) obj));
        }
    }

    /*
     * Быстрая сортировка списка с компаратором.
     */
    public static <T extends Comparable<? super T>> void quickSort(List<T> list, Comparator<? super T> comparator) {
        Object[] arr = list.toArray();
        quickSort(arr, comparator);

        ListIterator<T> iterator = list.listIterator();
        for (Object obj : arr) {
            iterator.next();
            iterator.set(((T) obj));
        }
    }

    private static void quickSort(Object[] arr, Comparator c) {
        if (c == null) {
            quickSort(arr, 0, arr.length - 1);
        } else {
            quickSort(arr, 0, arr.length - 1, c);
        }
    }

    private static void quickSort(Object[] arr, int l, int r) {
        if (l >= r) {
            return;
        }

        int m = partition(arr, l, r);
        quickSort(arr, 0, m - 1);
        quickSort(arr, m + 1, r);
    }

    private static void quickSort(Object[] arr, int l, int r, Comparator c) {
        if (l >= r) {
            return;
        }

        int m = partition(arr, l, r, c);
        quickSort(arr, 0, m - 1, c);
        quickSort(arr, m + 1, r, c);
    }

    /*
     * Задача: получить массив с опорным элементом.
     * Опорный элемент выбирается таким образом, чтобы все элементы
     * слева от него были меньше, а справа - больше.
     * [меньше][больше][неизвестно][опорный]
     * |       |       |           |
     * l       m       n           r
     */
    private static int partition(Object[] arr, int l, int r) {
        Comparable pivot = ((Comparable) arr[r]);
        int m = l;

        Comparable current;
        for (int n = l; n < r; n++) { // Проходим все до опорного
            current = ((Comparable) arr[n]);
            if (current.compareTo(pivot) < 0) { // текущий < опорного
                // Помещаем текущий в начало группы "больше"
                // и двигаем указатель на эту группу вправо, чтобы текущий попал в "меньше"
                Object temp = arr[m];
                arr[m] = arr[n];
                arr[n] = temp;
                m++;
            }
            // иначе текущий >= опорного
            // ничего не делаем и просто увеличиваем n
            // таким образом текущий окажется в группе "больше"
        }

        // Меняем местами опорный и первый из группы "больше",
        // чтобы опорный занял "свое" место
        Object temp = arr[m];
        arr[m] = arr[r];
        arr[r] = temp;

        return m;
    }

    private static int partition(Object[] arr, int l, int r, Comparator c) {
        Comparable pivot = ((Comparable) arr[r]);
        int m = l;

        Comparable current;
        for (int n = l; n < r; n++) {
            current = ((Comparable) arr[n]);
            if (c.compare(current, pivot) < 0) {
                Object temp = arr[m];
                arr[m] = arr[n];
                arr[n] = temp;
                m++;
            }

        }

        Object temp = arr[m];
        arr[m] = arr[r];
        arr[r] = temp;

        return m;
    }
}

/*
 * Тестовый класс, предназначенный для демонстрации
 * техник сортировки.
 */
public class Student implements Comparable<Student> {

    private int mId; // Личный номер студента
    private int mGpa; // Средний балл студента

    public Student(int id, int gpa) {
        mId = id;
        mGpa = gpa;
    }

    public int getId() {
        return mId;
    }

    public int getGpa() {
        return mGpa;
    }

    @Override
    public String toString() {
        return String.format("Student [mId=%d, mGpa=%d]", getId(), getGpa());
    }

    @Override
    public int compareTo(Student o) {
        if (o == null) { // Сравнение с null
            return 1;
        }

        if (this == o) { // Сравнение с самим собой
            return 0;
        }

        return Integer.compare(getId(), o.getId()); // Сравнить по mId
    }
}
