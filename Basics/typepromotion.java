public class typepromotion {
    public static void main (String args[]){
          char a='a';
          char b='b';
//char c=a-b;---> can not be converted from int to char so invalid
//Prints the value assigned to each character 
          System.out.println(a);
          System.out.println(b);
 //----converts the value through typecasting and prints their ASCII value
          System.out.println((int)(a));
          System.out.println((int)(b));
//----Type promotion happens only in the equation or the expressions...
          System.out.println(b-a);
          int d=10;
          float e =20.25f;
          long f=25;
          double g=30;
          //int ans=d+e+f+g;-->invalid
          double sum= d+e+f+g;//---->valid the biggest here is the double's value 
         // so all the calcuation along with anwer calculated is converted to double..
          System.out.println(sum);
          //---------------------
          byte x=5;
          byte y=( byte)(x*2);
          // after typr casting it gives the result and becomes correct 
          System.out.println(y);
    }
}
