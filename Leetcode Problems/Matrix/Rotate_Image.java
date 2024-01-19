class Solution {
    public void rotate(int[][] matrix) {
        int row_size = matrix.length;
        int col_size = matrix[0].length;
        for(int i=0; i<row_size; i++){
             for(int j=0; j<i; j++){
                 int temp = matrix[i][j];
                 matrix[i][j] = matrix[j][i];
                 matrix[j][i] = temp;
             }
        }
        for (int i=0; i< row_size; i++){
            reverse(matrix[i],0,row_size-1);
        }

    }
    private void reverse(int []mat, int i, int j){
        while(i<j){
            swap(mat,i++,j--);
        }
    }
     private void swap(int []mat, int i, int j){
         int temp = mat[i];
         mat[i] = mat[j];
         mat[j] = temp;
     }
}