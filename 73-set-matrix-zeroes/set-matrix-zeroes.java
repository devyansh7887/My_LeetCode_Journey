class Solution {
    public void setZeroes(int[][] matrix) {
        // <-------------BRUTE FORCE SOLUTION-------------->
        // Iterate the entrire matrix, the moment we find a zero,
        // Mark the entire row and the entire coumn as -1, so that it could be distincted,
        // Then iterate again, and convert all -1 to 0.
        // Time Complexity: O(n*m^3)
        // <-------------BETTER APPROACH SOLUTION------------->
        // Create a M size array and a N size array, initially put all values as zero
        // The moment a column or row has a zero, mark the 0 in the temp arrays as 1, in that place
        // For this you have to iterate once.
        // Again perform Iteration
        // And then check if the temp arrays are marked zero, it remains same
        // Else complete row zero  
        // matrix is assumed to be int[][]
        int n = matrix.length; // number of rows
        int m = matrix[0].length; // number of columns

        int[] col = new int[m]; // tracks columns with zero
        int[] row = new int[n]; // tracks rows with zero

        // Mark the rows and columns that should be zeroed
        for (int i = 0; i < n; i++) {           // For each row
            for (int j = 0; j < m; j++) {       // For each column
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        // Set the rows and columns to zero
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 1 || col[j] == 1) matrix[i][j] = 0;
            }
        }
    }
}
