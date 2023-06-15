package Collections.Iterable;

public class Main {
    public static void main(String args[]) {
        GenericList<Integer> list = new GenericList<>();
        list.setItems(1);
        list.setItems(2);
        for(var items:list){
            System.out.println(items);
        }
    }
}
