
// public class Bubblesort {

//     public static void bubble_sort(int arr[]){

//      for(int turn =0;turn<arr.length-1;turn++){
//         int swap=0;

//         for(int j=0;j<arr.length-1-turn ;j++){
//             if(arr[j]>arr[j+1]){
//                int temp=arr[j];
//                arr[j]=arr[j+1];
//                arr[j+1]=temp;
//                swap++;
//             }
//               if(swap==0){
//             System.out.println("Array is already sorted");
//         }
//         }
//      }
// } 

// //[printing the array]
//   public static void printArr(int arr[]){
//     for(int i=0;i<arr.length;i++){
//         System.out.print(arr[i]+ " ");
//     }
//   }
//     public static void main(String[] args) {
//         int arr[]={5,4,1,3,2};
//         System.out.println();
//         bubble_sort(arr);
//         printArr(arr);
//     }
// }
package Sorting;
import java.util.*;
//Program to do the Sorting
public class Bubblesort {

    //Function written to perform bubble sort
    public static void bubblesort(int arr[]){
        for(int turn =0;turn <arr.length-1;turn++){
          int swap=0;
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    //Swap in that condition
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp; 
                    }
                    // swap++;
                    // if(swap==0){
                    //   System.out.println("Array is already sorted");
                    // }
                    // else{
                    //   System.out.println("Array is Needed to be Sorted");
                    // }
                }
                if(swap==0){
                      System.out.println("Array is already sorted");
                    }
                    else{
                      System.out.println("Array is Needed to be Sorted");
                    }
            }
        }
public static void printArr(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+ " ");
    }
}
public static void main(String args[]){
    int arr[]={5,4,1,3,2};
    bubblesort(arr);
    printArr(arr);
 } 
}
