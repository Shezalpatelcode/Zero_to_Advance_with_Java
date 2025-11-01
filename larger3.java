//--------------------------------------------------------------
import java.util.*;
public class larger3 {
    public static void main(String []args){
         Scanner sc= new Scanner(System.in);
         int a= sc.nextInt();
          int b= sc.nextInt();
           int c= sc.nextInt();
           if(a>=b && a>=c){
            System.out.println("A is greater");
           }
           else if(b>=c)
           {
            System.out.println("B is greater");
           }
           else
           {
            System.out.println("C is greater");
           }


           ///--------------TERNARY OPERATOR------------
           int  number=4;
           String type=((number%2==0)? "even":"odd");
           System.out.println(type);
           //--------------------------------------------------

           //-------------------question----------------
           int marks= sc.nextInt();
           String Studentscore=(marks>=33)?"PASS":"FAIL";
           System.out.println(Studentscore);

           sc.close();
    }
}
//--------------------------------------------------------------