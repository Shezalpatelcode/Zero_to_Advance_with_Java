//Its a call by Reference example

package Arrays;
//import java.util.*;
public class argument {
    public static void update(int marks[]){
         for(int i=0;i<marks.length;i++){
              marks[i]=marks[i]+1;
         }
    }
    public static void main(String[] args) {
        int marks[]={97,98,99};
        int nonChangable= 5;
        update(marks);
        System.out.println("Marks after the updation");
          for(int i=0;i<marks.length;i++){
              System.out.println(marks[i] + " ");
         }
         System.out.println();
         System.out.println("the unchanged value is : " + nonChangable);
    }

}
