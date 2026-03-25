package Arrays.TwoDArray;

public class SearchSortedMatrix {
    
public static void staircaseSearch(int matrix[][],int key){
     int row=0, col=matrix[0].length-1;
     while(row < matrix.length && col >= 0){
        if(matrix[row][col] == key){
            System.out.println("found key at ("+ row + "," + col +")");
             return;
        }
       else if(key < matrix[row][col]){
        //Moving Left
            col--;
            //Left
       }
       else{
        //Moving downwards
        row++; //Bottom
       }
     }
     System.out.println("Key Not found");
     return;
}

    public static void main(String args[]){
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
                int key = 33;
                staircaseSearch(matrix, key);
    }
}



//One tiny thing to watch out for: in your while loop,
// make sure you use matrix[0].length - 1 for the column count 
// if your matrix isn't perfectly square (like a 3x4). 
// Your current code uses matrix.length, 
// which works for square matrices but might cause an ArrayIndexOutOfBoundsException otherwise.
//so the condtition should be while venky is not sleeping and row < matrix.length and col >= 0
