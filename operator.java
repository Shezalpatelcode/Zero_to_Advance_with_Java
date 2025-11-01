public class operator {
    public static void main(String[] args){
        int a= 10;
        int b=5;
        //---------------Simple arithmetic operator------------>
        System.out.println("Addition is -->" + (a+b));
        System.out.println("Substractionis -->" + (a-b));
        System.out.println("Multiplication is -->" + a*b);
        System.out.println("divide is -->" + a/b);
        System.out.println("Remainder is -->" + a%b);


        //------------------Unary Operator---------------------
         //Post increment and pre increment---------------
         int c=a++;
         System.out.println(c);
         int d=++a;
         System.out.println(d);
         //Post and pre decrement ------------------
         int  e=b--;
         System.out.println(e);
         int  f=--b;
         System.out.println(f);


         //--------------------RElational operators------------
         int x=10;
         int y=10;
         System.out.println(x==y);//true
         System.out.println(x!=y);//false
         System.out.println(x>y);//false
         System.out.println(x<y);//false
         System.out.println(x<=y);//true
         System.out.println(x>=y);//true


         //-------------------Logical operaors----------------
         System.out.println((2>1)&&(3>9));//false
         //System.out.println((2>1)||(3>0));//true
         System.out.println((2>1)&&(3>0));//true
         System.out.println(!(3>0));//false


         //-------------------Assignment operator-----------
         int A =10;//assigning
         A+= 10;//more faster way executing the code and optimized look
         System.out.println(A);
         
    }
}
