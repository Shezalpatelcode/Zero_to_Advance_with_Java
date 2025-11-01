import java.util.*;
public class areacircle {
    public static void main(String args[])
    {
        Scanner sc= new Scanner (System.in);
       float r= sc.nextFloat();
       float area= 3.14f * r * r;
       System.out.println(area);
       sc.close();
    }
}
// java bydefault takes every decimal value mentioned in the program as the double value even if it is initaialised as float 
//simply when writing the float put the (f )in front of decimal value if initaialsed datatype is float