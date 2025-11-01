package Patterns;
//DIAMOND
public class diamond {
    //function of the code to print the diamond pattern 
    public static void diamond_code(int n){
        //First Half.....
    for(int i=1;i<=n;i++){
        for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        for(int j=1;j<=(2*i)-1;j++ ){
            System.out.print("*");
        }
        System.out.println();
    }

    //Second Half.....
    for(int i=n;i>=1;i--)
    {
        for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        for(int j=1;j<=(2*i)-1;j++ ){
            System.out.print("*");
        }
        System.out.println();
    }
}
//main function 
    public static void main(String[] args) {
        diamond_code(7);
    }
}
