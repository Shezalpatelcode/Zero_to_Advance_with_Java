import java.util.*;

public class evenodd {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("==============");
        if(a%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is Odd");
        }
        sc.close();
    }

}
