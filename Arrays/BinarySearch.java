package Arrays;

public class BinarySearch {
    public static int binary_search(int numbers[],int key){
         int start=0;
         int end= numbers.length-1;
         while(start<=end){
            int mid=(start+end)/2;
             // Comparisions
            if(numbers[mid]==key){
               System.out.println("Key found Here!");
               return mid;
            }
            if(numbers[mid]<key){//Right
               start= mid+1;
            }
            else{//Left
                end= mid-1;
            }
         }
         return -1;
    }
   public static void main(String[] args) {
    //prerequiste Array shoild be sorted already
      int number[]={2,4,6,8,10,12,14};
      int key=10;
       System.out.println("Key Found at the Index : " + binary_search(number, key));
   }   
}
