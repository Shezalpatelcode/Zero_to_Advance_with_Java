package ArrayLIist;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.ArrayList;
public class classroom{
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        //String Boolean Float
        ArrayList<Integer>list = new ArrayList<>();
        //ArrayList<Boolean> list2 = new ArrayList<>();
        //ArrayList<String> list3 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        
        list.add(1,9);//O(n)
        System.out.println(list);   
        
        //Get Operation
        int element =list.get(2);
        System.out.println(element);
        
        //To remove
        list.remove(2);
        System.out.println(list);
        
        //set
        list.set(2,10);
        System.out.println(list);
        
        //Contains-----------------
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
        
        //  Size of Al
        System.out.println(list.size());
        //print 
        //loop
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i)+" ");
        }
        System.out.println();
    }
}

