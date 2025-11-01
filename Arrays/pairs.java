package Arrays;

public class pairs {
    public static void  pairs_array(int numbers[]){
        int tp=0;
      for(int i=0;i<numbers.length;i++){
        int curr= numbers[i];
        //int tp=0;
        for(int j=i+1;j<numbers.length;j++){
              System.out.print("("+ curr + "," + numbers[j]+ ")" + " ");
              tp++;
        }
        System.out.println();
      }
      System.out.println("Total Pairs  " + tp);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        pairs_array(numbers);
        
    }
}
//O(n^2):  Time complexity