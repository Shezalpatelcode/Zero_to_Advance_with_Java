package Arrays;

public class KadaneAlgo {
    // public class maxSubArray1 {
    // public static void Kadane_sum(int numbers[]){
    // int maxsum=Integer.MIN_VALUE;
    // int currsum=0;
    // int prefix[]= new int [numbers.length];
 
    // prefix[0]=numbers[0];

    // // calculate prefix array 
    // for(int i=1;i<prefix.length;i++){
    //    prefix[i]= prefix[i-1] + numbers[i];
    // }
 
    //      for(int i=0;i<numbers.length;i++){
    //              int start=i;
    //              for(int j=i;j<numbers.length;j++){
    //                 int end=j;
    //                  currsum=start==0? prefix[end] :prefix[end] - prefix[start-1];
    //                 // for(int k=start ;k<=end;k++){
    //                 //     //subarray ka sum
    //                 //     currsum+=numbers[k];
    //                 // }
    //               //  System.out.println(currsum);// to print

    //                 if(maxsum<currsum){
    //                      maxsum=currsum;
    //                 }
    //              }
    //      }
    //      System.out.println("Maximum sum : " + maxsum);
    // }
    public static void kadane(int numbers[]){
        int ms=Integer.MIN_VALUE;//minus infinity
        int cs=0;

        //simple and single loop
        for(int i=0;i<numbers.length;i++){
           cs= cs+numbers[i];
           if(cs<0){
            cs=0;
           }
           ms=Math.max(cs,ms);
        }
        System.out.println("our max subarray sum is : " +ms);
    }

    public static void main(String[] args) {
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
       kadane(numbers);
    }
}

