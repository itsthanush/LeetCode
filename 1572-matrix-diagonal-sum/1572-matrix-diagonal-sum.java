class Solution {
    public int diagonalSum(int[][] mat) {
        
        int sum=0;
        int rows=mat.length;
        for(int i=0;i<rows;i++){
                sum=sum+mat[i][i];
        }
        int sum1=0;
        for(int i=0;i<rows;i++){
            sum1=sum1+mat[i][rows-1-i];
        }
        int total_sum=sum+sum1;
        
        if (rows % 2 == 1) {
            total_sum -= mat[rows / 2][rows / 2];
        }
        return total_sum;
    }
}