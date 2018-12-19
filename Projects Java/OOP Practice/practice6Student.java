public class Student
{
    private int iDNumber;
    private String name;
    private int age;

    public Student(int iDNumber, String name, int age)
    {
        this.iDNumber = iDNumber;
        this.name = name;
        this.age = age;
    }

    public int getiDNumber()
    {
        return iDNumber;
    }

    public void setiDNumber(int iDNumber)
    {
        this.iDNumber = iDNumber;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "iDNumber=" + iDNumber +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
};
class Main
{
    public static void insertionSort(Student[] arr) { //сортировка вставками
        for(int i = 1; i < arr.length; i++){ //цикл начинается с первого элемента, т.к элемент до первого - наша отсортированаая последовательность
            //далее отностилельно элемента с номером 0 происходит вставка всех остальных
            Student stemp = arr[i];
            int pIndex = i - 1;
            while(pIndex >= 0 && arr[pIndex].getiDNumber() > stemp.getiDNumber()){ //поиск места для вставки
                arr[pIndex+1] = arr[pIndex];
                pIndex--;
            }
            arr[pIndex+1] = stemp;
        }
    }

    public static void main(String[] args)
    {
        Student[] mas = new Student[3];

        mas[0] = new Student(33, "Artem", 26);
        mas[1] = new Student(56, "Dima", 21);
        mas[2] = new Student(1, "Oleg", 18);

        insertionSort(mas);

        for (int i = 0; i < mas.length; i++)
        {
            System.out.println(mas[i].toString());
        }
    }

}
