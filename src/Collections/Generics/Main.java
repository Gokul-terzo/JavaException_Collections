package Collections.Generics;

public class Main extends GenericList{
    public static void main(String args[]){
        GenericList<Integer> list=new GenericList<>();
        list.setItems(1);
        list.setItems(2);
        System.out.println(list.getItems(1));
    }
}
