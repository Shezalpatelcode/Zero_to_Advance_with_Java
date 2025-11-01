package Arrays;
 //Brute force of talking out the maximum subarray
public class maxSubArray {
    public static void max_subarray(int numbers[]){
        // int currsum=0;
         int maxsum=Integer.MIN_VALUE;

         for(int i=0;i<numbers.length;i++){
                 int start=i;
                 for(int j=i;j<numbers.length;j++){
                    int end=j;
                    int currsum=1;
                    for(int k=start ;k<=end;k++){
                        //subarray ka sum
                        currsum*=numbers[k];
                    }
                    System.out.println(currsum);// to print
                    if(maxsum<currsum){
                         maxsum=currsum;
                    }
                 }
         }
         System.out.println("Maximum sum : " + maxsum);
    } 
    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        max_subarray(numbers);
    }
}
