package Arrays.TwoDArray;

public class spiralMatrix {

    public static void printSpiral(int[][] matrix) {
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while(startRow<=endRow && startCol<=endCol){
            //nthe && logic is given to print the matrix 
            //even if the matrix is not a perfect square matrix
            //Suppose if n x m or m x n matrix is given then the && logic will
            //  help to print the matrix in spiral form

            //----------------------------------------
           //top
              for(int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
              }

          //right
              for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
              }
          //Bottom
              for(int j=endCol-1;j>=startCol;j--){
                System.out.print(matrix[endRow][j]+" ");
              }

          //Left
              for(int i=endRow-1;i>=startRow;i--){
                //Special Condition for the left column because if the startCol and endCol are same then we will print the same column twice
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+ " ");
              }
              startRow++;
              startCol++;
              endRow--;
              endCol--;
        }
        //Print the new line after printing the spiral matrix
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        printSpiral(matrix);
    }
}
