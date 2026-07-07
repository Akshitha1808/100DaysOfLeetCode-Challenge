class Solution {
    public int maximalSquare(char[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        int[][] dp = new int[r][c];
        int max = 0;
        for(int i = 0; i < r; i++) 
        {
            dp[i][0] = mat[i][0] - '0';
            max = Math.max(max, dp[i][0]);
        }
        for(int j = 0; j < c; j++) 
        {
            dp[0][j] = mat[0][j] - '0';
            max = Math.max(max, dp[0][j]);
        }
        for(int i = 1; i < r; i++) 
        {
            for(int j = 1; j < c; j++) 
            {
                if(mat[i][j] == '1') 
                {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1]));
                }
                max = Math.max(max, dp[i][j]);
            }
        }
        return max * max;
    }
}
