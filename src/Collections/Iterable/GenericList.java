package Collections.Iterable;

import java.util.Iterator;

public class GenericList <T> implements Iterable<T>{
    private T[] items=(T[]) new Object[100];
    private int count;

    public void setItems(T items) {
        this.items[count++]=items;
    }

    public T getItems(int index) {
        return items[index];
    }
    @Override
    public Iterator<T> iterator() {
        return new InterableClass(this);
    }
    private class InterableClass implements Iterator<T>{
        private GenericList<T> list;
        private int count;
        public InterableClass(GenericList<T> list)
        {
            this.list=list;
        }
        public boolean hasNext(){
            return count< list.count;
        }
        public T next(){
            return list.items[count++];
        }
    }
}
