import java.util.Comparator;

/*
 * Компаратор, предназначенный для сортировки студентов по средней оценке
 * по убыванию.
 */
public class StudentByGpaComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1 == s2) {
            return 0;
        }

        if (s1 == null) {
            return -1;
        }

        if (s2 == null) {
            return 1;
        }

        return Integer.compare(s2.getGpa(), s1.getGpa());
    }
}
