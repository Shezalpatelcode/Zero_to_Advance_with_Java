package Functions;
import java.util.*;

public class sum {// name of the class

    //using int as the return type.....
    public static int calci(int a,int b){ //parameters or formal parameters
    // Scanner sc= new Scanner(System.in);
    // int a=sc.nextInt();
    // int b=sc.nextInt();
    int sum= a+b;
    System.out.println(sum  + " is the sum of the given numbers");
    return sum;
    }

//Using void as the return type.....
//       public static void calci(int a,int b){
//     // Scanner sc= new Scanner(System.in);
//     // int a=sc.nextInt();
//     // int b=sc.nextInt();
//     int sum= a+b;
//     System.out.println(sum  + " is the sum of the given numbers");
//    // return sum;
//     }

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
         calci(a,b);// arguments or actual parameters
        //System.out.println(sum1);
        sc.close();
    }
    
}
