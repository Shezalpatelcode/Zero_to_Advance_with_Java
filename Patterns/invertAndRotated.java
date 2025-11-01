package Patterns;
  
//    public static void inverted_rotated(int n){
        
//     //outer
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i;j++){
//             //spaces
//             System.out.println(" ");
//         }
//         for(int j=1;j<=i;j++){
//             //
//             System.out.print("*");
//         }
//         System.out.println();
//     }
// }
// AN inverted and rotated triangle 
/*
 *        *
 *      * *
 *     * * *
 *   * * * *
 */

 public class invertAndRotated {
    public static void inverted_rotated(int n){
        
    //outer
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            //spaces
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            //
            System.out.print("*");
        }
        System.out.println();
    }
}
     public static void main(String[] args) {
        inverted_rotated(4);
     }
    
}
