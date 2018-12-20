import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Тестируем быструю сортировку
        List<Student> students = createFakeStudents();
        System.out.println("-----------------------------");
        printList(students);
        Sorting.quickSort(students);
        printList(students);

        Comparator<Student> comparator = new StudentByGpaComparator();

        // Тестируем быструю сортировку с компаратором
        students = createFakeStudents();
        System.out.println("-----------------------------");
        printList(students);
        Sorting.quickSort(students, comparator);
        printList(students);
    }

    /*
     * Создает тестовый массив из 10 студентов.
     */
    public static List<Student> createFakeStudents() {
        Random random = new Random();
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            students.add(new Student(random.nextInt(100), random.nextInt(6)));
        }

        return students;
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj.toString());
        }
        System.out.println();
    }
}
