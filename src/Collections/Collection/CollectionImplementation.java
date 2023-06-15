package Collections.Collection;

import java.io.CharArrayReader;
import java.util.*;

public class CollectionImplementation {
    public static void show(){
        //Collection Interface(It is not indexed)
        Collection<Integer> list1=new ArrayList<>();
        list1.add(12);
        list1.add(3);
        Collections.addAll(list1,45,6,7);
        System.out.println(list1);
        list1.remove(3);
        System.out.println(list1.isEmpty());
        list1.clear();
        System.out.println(list1.isEmpty());
        list1.add(3);
        list1.contains(3);
        Collection<Integer> list2=new ArrayList<>();
        list2.add(3);
        System.out.println(list1.equals(list2));


        //List Interface(Indexed)
        List<Integer> list3=new ArrayList<>();
        list3.add(3);
        list3.indexOf(0); //returns -1 as the list doesnt contain the element 0
        Collections.addAll(list3,4,5,6,7);
        list3.add(3);
        System.out.println(list3.size());
        System.out.println(list3.lastIndexOf(3));
        Object[] nums=list3.toArray();
        System.out.println(nums[0]);
    }
}
