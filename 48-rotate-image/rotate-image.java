class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // tranpose the matrix
        for(int i = 0; i < n - 1; i++){
            for(int j = i+1; j<n; j++){
                if(i==j){
                    continue;
                }else{
                    int temp = matrix[j][i];
                    matrix[j][i] = matrix[i][j];
                    matrix[i][j] = temp;
                }
            }
        }
        // reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}