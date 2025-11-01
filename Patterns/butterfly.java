package Patterns;

public class butterfly {
    public static void butter_fly(int n){

        //1 st half
         for(int i=1;i<=n;i++){
            //stars on the left
               for(int j=1;j<=i;j++){
                  System.out.print("*");
               }

               //spaces in the middle
               for(int j=1;j<=(2*(n-i));j++){
                    System.out.print(" ");
               }
               //stars... on right
               for(int j=1;j<=i;j++){
                   System.out.print("*");
               }
               System.out.println();

         }
         //2 nd half -----------------------
         for(int i=n;i>=1;i--){
             for(int j=1;j<=i;j++){
                  System.out.print("*");
               }

               //spaces in the middle
               for(int j=1;j<=(2*(n-i));j++){
                    System.out.print(" ");
               }
               //stars... on right
               for(int j=1;j<=i;j++){
                   System.out.print("*");
               }
               System.out.println();
         }
        //  public static void main(String args[]){
        //          butter_fly(4);
        //  }
    }
     public static void main(String args[]){
                 butter_fly(8);
         }
}
