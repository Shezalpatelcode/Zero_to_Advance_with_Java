package Loops;
//Sum of n natural numbers starting from 1 to Nth number entered by the user
import java.util.*;
public class sumofn {
    public static void main(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number till where you want the sum:---");
        int n= sc.nextInt();
        int sum=0;
        int counter =1;
        while(counter<=n){
            sum=sum+counter;
            counter++;
        }
        System.out.println("sum=" +  sum);
        sc.close();
    }
}
