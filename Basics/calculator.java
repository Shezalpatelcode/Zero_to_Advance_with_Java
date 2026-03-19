import java.util.*;

public class calculator {
    public static void main(String []args){
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter the two number for operation");
         int a=sc.nextInt();
         int b=sc.nextInt();
         System.out.println("Enter the operator");
         char op= sc.next().charAt(0);
         switch(op){
           
        case '+':
            System.out.println("Addition is :" + (a+b) );
             break;
        case '-':
            System.out.println("Substraction is :" + (a-b) );
             break;
        case '*':
            System.out.println("Multiplication is :" + (a*b) );
             break;
        case '/':
            System.out.println("Division is :" + (a/b) );
             break;
         case '%':
            System.out.println("Remainder/Modulo is :" + (a%b) );
             break;
             default:
        System.out.println("The operator is invalid");
         }
         sc.close();
    }
}
