package Sorting;

public class Selectionsort {
    public static void selection_sort(int arr[]) {
        for(int i=0;i<arr.length;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]<arr[j]){
                    //get the min element 
                    minpos=j;
                }
            }
            //swap
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void printArr(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+ " ");
    }
  }
    public static void main(String[] args) {
        int arr[]={5,4,1,2,3};
        selection_sort(arr);
        printArr(arr);

    }
}
