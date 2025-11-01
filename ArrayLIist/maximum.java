package ArrayLIist;

import java.util.ArrayList;

public class maximum {
    public static void main(String[] args) {
        
      ArrayList<Integer> list= new  ArrayList<>();
       list.add(23);
       list.add(34);
       list.add(45);
       list.add(56);
       int max=Integer.MIN_VALUE;
    for(int i=0;i<list.size();i++){
       max=Math.max(max,list.get(i));
    }
    System.out.println("Max element :" + max);
}
} 
