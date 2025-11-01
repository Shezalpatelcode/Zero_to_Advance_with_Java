import java.util.*;

public class incometax {
    public static void main(String []args){
      int tax;
      Scanner sc= new Scanner(System.in);
      int income=sc.nextInt();
      if(income <500000){
         //System.out.println("Tax Applied --> 0/-");
         tax=0;
      }
      else if(income>=500000 && income<1000000 ){
         // System.out.println("Income along with taxation: " + (income*0.20));
         tax=(int)(income*0.20);
      }
      else
      {
         //System.out.println("Income along with taxation: " + (income*0.30));
         tax=(int)(income*0.30);
      }
      System.out.println("Your tax is " + tax);
      sc.close();
    }
}
