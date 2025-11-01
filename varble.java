import java.util.*;
//an imported package that is already defined within the Java 
public class varble {
    public static void main(String[] args) {
        //Variables in Java 
        int a=10;
        int b=5;
        System.out.println(a);
        System.out.println(b);
        String name="Tony Stark";
        System.out.println(name);

        a=50;// again replacing the value of a as it is not constant and can be changed again

        //different types of Datatypes
        System.out.println(a);
        byte by=8;// byte storing only 1 byte and 8 bits of storage
        System.out.println(by);
        char ch='a';// storing 1 byte of storage 
        System.out.println(ch);
        boolean var= false;// taking one byte of storage
        System.out.println(var);
        
        //Input Taking in Java
        //User taken data 
        Scanner sc= new Scanner(System.in);
        //String input = sc.next();   // do not print the words with space as Tony Stark so only Tony will get print 
        String input=sc.nextLine();// here the whole namee including the space will get printted
        System.out.println(input);

        sc.close();
    }
}
