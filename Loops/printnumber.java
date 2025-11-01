package Loops;
//Q1) //Print number from 1 to 10
//Q2)   Print number from 1 to N
import java.util.*;

public class printnumber {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:--");
        int a = sc.nextInt();

        int num=1;
        while(num<=a){
            System.out.println(" "+ num);
            num++;
        }
        sc.close();
    }
}
