package Patterns;

public class FloydsTriangle {
     public static void Floyds_Triangle(int n){
        int counter=1;
    //outer
    for(int i=1;i<=n;i++){
        //Inner loop
        for(int j=1;j<=i;j++){
            //spaces
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();
    }
}
     public static void main(String[] args) {
        //calling function 
        Floyds_Triangle(5);
     }
}
