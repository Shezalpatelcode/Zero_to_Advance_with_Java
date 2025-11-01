import java.util.*;
public class conversion {
    public static void main(String[] args) {
        //when your destination type is greater than the source type
        int a=25;
        long b=a;
        System.out.println(b);
        //25..
        //when your destination type is smaller than the source type ..
        //in that condition you might loose some data called lossy conversion
        // long c=34;
        // int d=c;
        // System.out.println(c);
        Scanner sc= new Scanner(System.in);
        //int number= sc.nextFloat();--> not allowed
        float number= sc.nextInt(); // allowed
        System.out.println(number);
        sc.close(); 
        float c=25.12f;
        int d= (int)c ;
        System.out.println(d);
        char ch ='a';
        char ch1= 'b';
        int number2= ch1;
        int number1= ch;
        System.out.println(number1);
         System.out.println(number2);
    }
}
