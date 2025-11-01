package ArrayLIist;
import java.util.ArrayList;
public class ReverseList {
    public static void main(String[] args) {
        ArrayList<Integer> list= new  ArrayList<>();
       list.add(23);
       list.add(34);
       list.add(45);
       list.add(56);
       //for loop
       for(int i=list.size()-1; i>=0;i--){
            System.out.print(list.get(i)+" ");
       }
       System.out.println();
    }
}
