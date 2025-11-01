package ArrayLIist;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.*;

public class sorting {
    public static void main(String[] args) {
        
      ArrayList<Integer> list= new  ArrayList<>();
       list.add(23);
       list.add(34);
       list.add(45);
       list.add(56);
       System.out.println(list);
       //Ascending order
       Collections.sort(list);
       System.out.println(list);

       //descending 
       Collections.sort(list,Collections.reverseOrder());
       System.out.println(list);
  }
}
