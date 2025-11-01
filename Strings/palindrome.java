package Strings;

public class palindrome {
    public static boolean pain_drome(String str){
       for(int i=0;i<str.length()/2;i++){
          int n=str.length();
           if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
                //Not a palindrome
           }
       }
       //is a palindrome
       return true;
    }
    public static void main(String[] args) {
        String str="racecar";
        System.out.println(pain_drome(str));
    }
}
