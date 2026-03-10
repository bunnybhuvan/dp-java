class FallingPath {

    public static int minFallingPath(int[][] matrix){

        int n = matrix.length;
        int dp[][] = new int[n][n];

        for(int j=0;j<n;j++)
            dp[0][j] = matrix[0][j];

        for(int i=1;i<n;i++){

            for(int j=0;j<n;j++){

                int up = dp[i-1][j];

                int left = (j>0) ? dp[i-1][j-1] : Integer.MAX_VALUE;

                int right = (j<n-1) ? dp[i-1][j+1] : Integer.MAX_VALUE;

                dp[i][j] = matrix[i][j] +
                           Math.min(up, Math.min(left,right));
            }
        }

        int ans = Integer.MAX_VALUE;

        for(int j=0;j<n;j++)
            ans = Math.min(ans, dp[n-1][j]);

        return ans;
    }

    public static void main(String[] args){

        int matrix[][] = {
            {2,1,3},
            {6,5,4},
            {7,8,9}
        };

        System.out.println("Minimum Falling Path Sum: " +
                           minFallingPath(matrix));
    }
}