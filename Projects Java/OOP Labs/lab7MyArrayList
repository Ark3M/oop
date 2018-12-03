public class MyArrayList{

    private Object[] elementData;
    private int size;

    public MyArrayList() {
        this(10);
    }
    public MyArrayList(int initialCapacity) {
        super();
        if (initialCapacity < 1)
            throw new IllegalArgumentException("Capacity should be positive number");
        this.elementData = new Object[initialCapacity];
    }

    public boolean add(Object obj) {
        validateCapacity(size + 1);
        elementData[size++] = obj;
        return true;
    }

    public Object get(int index) {
        return elementData[index];
    }

    public int size() {
        return size;
    }

    public void validateCapacity(int minCapacity) {
        int oldCapacity = elementData.length;
        if (minCapacity > oldCapacity) {
            Object oldData[] = elementData;
            int newCapacity = (oldCapacity * 3)/2 + 1;
            if (newCapacity < minCapacity)
                newCapacity = minCapacity;
            elementData = new Object[newCapacity];
            System.arraycopy(oldData, 0, elementData, 0, size);
        }
    }

    public Object remove(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
        Object oldValue = elementData[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elementData, index+1, elementData, index, numMoved);
        }
        elementData[--size] = null;
        return oldValue;
    }

    public Boolean isEMpty() {
        return size == 0;
    }
}
