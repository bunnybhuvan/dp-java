class Knapsack {

    public static int knapsack(int W, int wt[], int val[], int n) {

        int dp[][] = new int[n+1][W+1];

        for(int i = 1; i <= n; i++) {

            for(int w = 1; w <= W; w++) {

                if(wt[i-1] <= w)
                {
                    dp[i][w] = Math.max(
                        val[i-1] + dp[i-1][w-wt[i-1]],
                        dp[i-1][w]
                    );
                }
                else
                {
                    dp[i][w] = dp[i-1][w];
                }
            }
        }

        return dp[n][W];
    }

    public static void main(String[] args) {

        int val[] = {10,40,50,70};
        int wt[] = {1,3,4,5};
        int W = 8;
        int n = val.length;

        System.out.println("Maximum profit: "+knapsack(W,wt,val,n));
    }
}