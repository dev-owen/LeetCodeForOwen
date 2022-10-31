class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = m-1; i > 0; i--) {
            int tmp = matrix[i][0];
            for(int j = 1; j < m-i && j < n; j++) {
                if(matrix[i+j][j] != tmp) return false;
            }
        }
        for(int i = 0; i < n; i++) {
            int tmp = matrix[0][i];
            for(int j = 1; j < n-i && j < m; j++) {
                if(matrix[j][i+j] != tmp) return false;
            }
        }
        return true;
    }
}