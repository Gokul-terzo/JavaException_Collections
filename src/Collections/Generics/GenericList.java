package Collections.Generics;

public class GenericList <T>{
    private T[] items=(T[]) new Object[100];
    private int count;

    public void setItems(T items) {
        this.items[count++]=items;
    }

    public T getItems(int index) {
        return items[index];
    }
}
