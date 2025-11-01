package Patterns;
//Hollow Rhombus
public class hollowrhombus {
    public static void solid_rhombus(int n){
       for(int i=1;i<=n;i++){
        for(int j=1;j<=(n-i);j++){
           System.out.print(" ");
        }
        for(int j=1;j<=n;j++){//row wise
            if(i==1|| i==n|| j==1||j==n){// boundary condition
                  System.out.print("*");
            }
           // System.out.println();
           else{
            System.out.print(" ");
           }
        }
        System.out.println();
       }
    }
    public static void main(String[] args) {
        solid_rhombus(10);
    }
}
