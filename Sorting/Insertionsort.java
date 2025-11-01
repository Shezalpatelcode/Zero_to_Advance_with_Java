package Sorting;
import java.util.Arrays;
import java.util.Collections;
public class Insertionsort {

    //To do The insertion sort
    public static void Insertion_sort(Integer arr[]){
            for(int i=0;i<arr.length;i++){
                int curr=arr[i];
                int prev=i-1;
                //finding out the correct postion for insertion 
                while(prev>=0 && arr[prev]> curr){
                    arr[prev+1]=arr[prev];
                    prev--;
                }
                //insertion
                arr[prev+1]=curr;
            }
    }

    //To print the array
      public static void printArr(Integer arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+ " ");
    }
  }

  // Main Function
    public static void main(String []args){
       Integer arr[]={5,4,1,3,2,7,6};
       System.out.println();
       System.out.println("Array after Insertion Sort--->");
    //    Insertion_sort(arr);
    //    printArr(arr);
       System.out.println();
    //Either way ----> to simply pass the array in the inbuilt sort function
    //    Arrays.sort(arr);
    //    printArr(arr);
    // System.out.println();
      
    // Or pass the arr along with the starting index and the ending index
    //    Arrays.sort(arr,0,5);
    //    printArr(arr);

    //in the Descending order
    Arrays.sort(arr,Collections.reverseOrder());
    printArr(arr);
    
    }

}
