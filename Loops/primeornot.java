package Loops;
import java.util.*;

public class primeornot {
    public static void main(){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number: ");
     int n =sc.nextInt();
      boolean isPrime= true;

     if(n==2){
         System.out.println("It is a Prime number ");
     }
     else{
         //boolean isPrime= true;
     for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){// n is a multiple of i(i is not 1 or number)
            isPrime=false;
        }
     }
     }
    //  boolean isPrime= true;
    //  for(int i=2;i<=n-1;i++){
    //     if(n%i==0){// n is a multiple of i(i is not 1 or number)
    //         isPrime=false;
    //     }
    //  }
     if(isPrime==true){
         System.out.println("Number is a Prime");
     }
     else{
        System.out.println("It is not a Prime");
     }
     sc.close();
    }
}
