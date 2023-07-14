import java.util.ArrayList;

public class MyList<T> {
    private ArrayList<T> myList;
    private int capacity;
    private static final int DEFAULT_CAPACITY = 10;


    public ArrayList<T> getMyList() {
        return myList;
    }

    public void setMyList(ArrayList<T> myList) {
        this.myList = myList;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public MyList() {
        this.myList = new ArrayList<>(DEFAULT_CAPACITY);
        capacity = DEFAULT_CAPACITY;
        System.out.println("Dizinin kapasitesi : " + capacity);
    }

    public MyList(int capacity) {
        this.myList = new ArrayList<>(capacity);
        this.capacity = divideByTen(capacity);
        System.out.println("Dizinin kapasitesi : " + capacity);
    }

    public static int divideByTen(int number) {
        int result = number;
        boolean isTen = true;

        while (isTen) {
            if (result % 10 == 0) {
                break;
            }
            result++;
        }
        return result;
    }

    public int size(){
        return (this.myList.size());
    }

    public int getCapacity(){
        return (this.capacity);
    }

    public void add(T data) {
        myList.add(data);
        if (myList.size() > this.getCapacity()) {
            this.setCapacity(capacity * 2);
        }
    }

    public T get(int index) {
        if (index < 0 || index > myList.size()){
            return null;
        } else {
            return myList.get(index);
        }
    }

    public T set(int index, T data) {
        if (index < 0 || index >= myList.size()) {
            return null;
        }
        return (myList.set(index, data));
    }
    public T remove(int index) {
        if (index < 0 || index >= myList.size()) {
            return null;
        }
        T removedItem = myList.get(index);
        myList.remove(index);
        for(int i = index; i < myList.size(); i++){
            myList.set(i, myList.get(i + 1));
        }
        return removedItem;
    }

    public String toString() {
        int i;
        StringBuilder result = new StringBuilder("[");
        for (i = 0; i < myList.size() - 1; i++) {
            result.append(myList.get(i)).append(",");
        }
        result.append(myList.get(i));
        result.append("]");
        return (result.toString());
    }
}
