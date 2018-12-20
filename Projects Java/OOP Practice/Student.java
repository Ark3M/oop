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
