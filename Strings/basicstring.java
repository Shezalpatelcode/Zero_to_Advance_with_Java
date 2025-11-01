package Strings;
import java.util.*;

public class basicstring {

    public static void printLetters(String str){
       for(int i=0;i<str.length();i++){
          System.out.print(str.charAt(i)+ " ");

       }
       System.out.println();
    }
    public static String toUpperCase(String str){
     StringBuilder sb= new StringBuilder("");
     char ch= Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' '&& i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
             return (sb.toString());
        }
    
    public static void main(String[] args) {
        //char arr[]={'a','b','c','d'};
        //String str="abcd";
        //String str2= new String("xyz");
        //Strings are immutable
        Scanner sc= new Scanner(System.in);
        // String name;
        // name= sc.nextLine();
        // System.out.println(name);

        // //Length of the string-->.length
        // System.out.println(name.length());

        //concatenate
        String firstName="Captain";
        String lastName="Sheezal";
        String full= firstName + " " + lastName;
        System.out.println(full);
        //System.out.println(full.charAt(2));
        //printLetters(full);
        // Comparision
       // String s1="Captain";
        //String s2="Captain";
        //--------------String Builder---------------
       StringBuilder sb= new StringBuilder("");
       for(char ch='a';ch<='z';ch++){
        sb.append(ch);
       }
       System.out.println(sb);

       //------------UpperCase-------------
       String str0="hi i am Sheezal";
       System.out.println(toUpperCase(str0));

        sc.close();
    
}
}
