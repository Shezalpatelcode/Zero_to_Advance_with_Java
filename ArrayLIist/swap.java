package ArrayLIist;
import java.util.ArrayList;
public class swap{
    public static void swap1(ArrayList<Integer>list, int idx1, int idx2){
         int temp=list.get(idx1);
         list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
public static void main(String[] args) {
      ArrayList<Integer> list= new  ArrayList<>();
       list.add(23);
       list.add(34);
       list.add(45);
       list.add(56);
       int idx1=1, idx2=3;
       System.out.println(list);
       swap1(list,idx1, idx2);
       System.out.println(list);
    }
}
