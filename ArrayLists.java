import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(0);
        list.add(5); 
        System.out.println(list);

        int element=list.get(0);
        System.err.println(element);
       
        list.add(2,4);
        System.out.println(list);

        //set element
        list.set(0, 6);
        System.out.println(list);

        //array list size
        int size=list.size();
        System.out.println(size);

        //loops on arrray lisr
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        //sorting

        Collections.sort(list);
        System.out.println(list);
        
    }
}
