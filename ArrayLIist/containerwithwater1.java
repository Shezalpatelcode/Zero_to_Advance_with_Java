package ArrayLIist;
import java.util.ArrayList;
///Two methods to solve the problem
///Brute Force approach --------
/// Pointer Approach ----------
public class containerwithwater1 {

    public static int storewater(ArrayList<Integer>height){
          int maxwater=0;
          int lp=0;
          int rp=height.size()-1;

          while(lp<rp){
            int ht= Math.min(height.get(lp) ,height.get(rp));
            int width=rp-lp;
            int currWater=ht*width;
            maxwater= Math.max(maxwater,currWater);
            //update ptr
            if(height.get(lp)<height.get(rp)){
                lp++;

            }else{
                rp--;
            }
          }
          return maxwater;
    }
    public static void main(String[] args) {
        ArrayList<Integer>height =new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);


       //Pointer Approach
        System.out.println(storewater(height));
    }
}