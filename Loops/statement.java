package Loops;
import java.util.*;
public class statement {
    public static void main(String[] args) {
        //use of 
        // for(int i=1;i<=5;i++){
        //     if(i==3){
        //         System.out.println("You have reached your condition to break this loop");
        //         break;
        //     }
        //     //System.out.println("You are out of the loop");
        //     System.out.println(i);
        // }
        //  System.out.println("You are out of the loop now");
        //-----------------------------------------------------------
        //Q1)) Enter the number if it si not the multiple of 10 and break if the number is the multiple of 10
       Scanner sc = new Scanner (System.in);
        do{
            System.out.println("Enter the number :");
            int n=sc.nextInt();
            
            if(n%10==0){
                System.out.println("you enter the multiple of 10.....");
               break;
            }
            System.out.println(n);
        }while(true);
        sc.close();
    }
}
