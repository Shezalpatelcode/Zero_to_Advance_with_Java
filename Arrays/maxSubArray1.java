package Arrays;
//prefix method
public class maxSubArray1 {
    public static void max_SubArray1(int numbers[]){
    int maxsum=Integer.MIN_VALUE;
    int currsum=0;
    int prefix[]= new int [numbers.length];
 
    prefix[0]=numbers[0];

    // calculate prefix array 
    for(int i=1;i<prefix.length;i++){
       prefix[i]= prefix[i-1] + numbers[i];
    }
 
         for(int i=0;i<numbers.length;i++){
                 int start=i;
                 for(int j=i;j<numbers.length;j++){
                    int end=j;
                     currsum=start==0? prefix[end] :prefix[end] - prefix[start-1];
                    // for(int k=start ;k<=end;k++){
                    //     //subarray ka sum
                    //     currsum+=numbers[k];
                    // }
                  //  System.out.println(currsum);// to print

                    if(maxsum<currsum){
                         maxsum=currsum;
                    }
                 }
         }
         System.out.println("Maximum sum : " + maxsum);
    }
    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        max_SubArray1(numbers);
    }
}
// Time complexity: O(N^2) --> more 
//'Optimzied than brute force