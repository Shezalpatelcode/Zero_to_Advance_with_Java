// Wap to add and prodyct two numbers taken from the user
import java.util.*;
public class sumof {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        //int a=5;
        //int b=10;
        System.out.println("Enter the first number");
        int a= sc.nextInt();
        System.out.println("Enter the second number");
        int b= sc.nextInt();
        int sum=a+b;
        int pro = a*b;
        System.out.println("The sum of the two numbers is :" +  sum );

        System.out.println("The sum of the two numbers is :" +  pro );
    sc.close();
    }

}
