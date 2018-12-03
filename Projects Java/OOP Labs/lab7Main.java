public class Main {
    public static void main(String[] args) {
        MyArrayList cars = new MyArrayList();
        cars.add("Ford");
        cars.add("Nissan");
        cars.add("Tesla");

        System.out.println("Array size: " + cars.size());
        cars.remove(1);
        System.out.println("Array size: " + cars.size());
    }
}
