package Strings;

import java.net.SocketPermission;
import java.util.Scanner;
public class basic {

    //Print the characters of the array..
    // public static void printLetters(String str){
    //     for(int i=0;i<str.length();i++){
    //         System.out.print(str.charAt(i) +" ");
    //     }
    // }


    //Print whether it is a palindrome or not
    public static boolean isPalindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            int n =str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                //Palindrome
                return false;
            }
        }

        return true;
    }
    public static void main(String []args){
         //char arr[]={'a','b','c','d'};
         //String str="Captain Sheezal";
         //String str= new String("xyz");
         //Strings are immutable:they do not get change
         //if any change is done then a new string is automatically created
         //instead of creating the changes in the old/existing string


          //Scanner sc= new Scanner(System.in);
         //String name;
         //name = sc.next();//takes a single word as input
         //name= sc.nextLine()
         // can take whole sentance
         // which may include the spaces
         //System.out.println(name);

        //  String fullName="Lietunant Sheezal";
        //  System.out.println(fullName.length());
        
         //Concatenation of Strings
            // String firstName="Lieutnant";
            // String lastName="Sheezal";
            // String fullName1= firstName + " " + lastName;
            // System.out.println(fullName1);

        //charAt() method
        // System.out.println(fullName1.charAt(0));
        // printLetters(fullName1);

        //Palindrome.....
        String str="moom";
        System.out.println(isPalindrome(str));

        

    }
}
